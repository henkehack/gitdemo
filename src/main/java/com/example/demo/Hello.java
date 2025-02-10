package com.example.demo;

public class Hello {
    String name;

    public Hello(String name) {
        this.name = name;
    }

    public void someOtherMethod() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name + "2";
    }
}
