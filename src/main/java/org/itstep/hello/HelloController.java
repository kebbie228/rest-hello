package org.itstep.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    private static HelloRepo helloRepo =new HelloRepo();

    //Endpoint
    @GetMapping("/hello")
    public List<Hello> hello(){
        return helloRepo.hello();
    }
    @GetMapping("/hello/{name}")
    public Hello helloName(@PathVariable String name){
        return helloRepo.helloName(name);
    }
    @GetMapping("/{hello}/{name}")
    public Hello helloR(@PathVariable String hello, @PathVariable String name) {
        return new Hello(hello, name);// заменить нужно так же как 1 и 2
    }
    @GetMapping("/hello2")
    public Hello helloP(@RequestParam String message, @RequestParam String name) {
        return new Hello(message, name);//заменить нужно так же как 1 и 2
         }
        @PostMapping("/hello")//REST
        @ResponseStatus(HttpStatus.CREATED)
        public void changeName(@RequestBody Hello hello){
        helloRepo.changeName(hello.getId(),hello.getName());
        }

        @DeleteMapping("/hello/{id}")
    public void deleteName(@PathVariable long id){
        helloRepo.deleteName(id);
        }

    }
