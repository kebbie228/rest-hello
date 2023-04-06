package org.itstep.hello;

import java.util.concurrent.atomic.AtomicInteger;

//POJO-класс
public class Hello {
    private static final AtomicInteger counter = new AtomicInteger(0);



    private long id;
    private String message = "Hello ";
    private String name = "world";
    //no args constructor - писать всегда
    public Hello() {
        this.id = counter.incrementAndGet();
    }

    public Hello(String message, String name) {
        this.message = message;
        this.name = name;
        this.id = counter.incrementAndGet();
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}