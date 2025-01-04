package com.strings.Examples;

public final class ImmutableClass {
    private int age;
    private String name;

    public ImmutableClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass std = new ImmutableClass(24, "Roshan");
        System.out.println("My name is " + std.getName() + ". And i am " + std.getAge() + " years old");

        ImmutableClass std1 = new ImmutableClass(30, "Rohan");
        System.out.println("My name is " + std1.getName() + ". And i am " + std1.getAge() + " years old");

        ImmutableClass std2 = new ImmutableClass(40, "Ramesh");
        System.out.println("My name is " + std2.getName() + ". And i am " + std2.getAge() + " years old");
    }
}