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
        String newName = this.name;
        newName = newName.replaceAll("[^a-zA-Z0-9]", "_");
        return newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void commit7() {
        Hello hello = new Hello("World");
    }

    public static void commit87() {
        Hello hello = new Hello("World");
    }

    public static void commit9() {
        Hello hello = new Hello("World");
    }

    public static void commit10() {
        Hello hello = new Hello("World");
    }

    public static void commit11() {
        Hello hello = new Hello("World");
    }

    public static void commit13() {
        // nothing here
    }

    public static void commitRel12() {
        Hello hello = new Hello("World");
    }

    public String getName2() {
        return name + "2";
    }

    public void setName2(String name) {
        this.name = name + "2";
    }
}
