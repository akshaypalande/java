package com.project;

public class Mice extends Animal {

    public Mice (String id ) {
        this.id = id;
        name = "Mice";
    colour = Colour.GRAY;
    }

    @Override
    public void eats() {
        System.out.println("Mice eats cheese");
    }

    @Override
    public void swim() {

    }
}
