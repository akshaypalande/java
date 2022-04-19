package com.project;

public class Cat extends Animal {

    public Cat(String id) {
        this.id = id;
        name = "Cat";
        colour = Colour.WHITE;
    }

    @Override
    public void eats() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void swim() {

    }
}


