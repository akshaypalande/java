package com.project;

public class Duck extends Birds implements Flyable, Swimable {

    public Duck(String id) {
        this.id = id;
        name = "Duck";
        colour = Colour.WHITE;
    }
    @Override
    public void eats() {
        System.out.println("Duck eats fish");
    }

    @Override
    public void swim() {
        System.out.println(" Duck can swim");
    }

    @Override
    public void fly() {
        System.out.println(" Duck can fly");
    }

}
