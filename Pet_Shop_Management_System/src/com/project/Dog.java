package com.project;

public class Dog extends Animal {

    public Dog (String id) {
        this.id = id;
        name = "Dog";
        colour = Colour.BROWN;
    }

    @Override
    public void eats() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void swim() {
        System.out.println(" Dog can swim");
    }

}