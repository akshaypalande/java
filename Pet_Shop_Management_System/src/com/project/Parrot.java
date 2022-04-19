package com.project;

public class Parrot extends Birds {

    public Parrot(String id) {
        this.id = id;
        name = "Parrot";
        colour = Colour.GREEN;
    }

    @Override
    public void eats() {
        System.out.println("Parrot eats cereals");

    }

    @Override
    public void fly() {
        System.out.println(" Parrot can fly");

    }
}
