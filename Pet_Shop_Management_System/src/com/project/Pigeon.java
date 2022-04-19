package com.project;

public class Pigeon extends Birds {

    public Pigeon(String id) {
        this.id = id;
        name = "Pigeon";
        colour = Colour.WHITE;
    }

    public void eats(){
        System.out.println("Pigeon eats peanut");
    }

    @Override
    public void fly() {

    }
}
