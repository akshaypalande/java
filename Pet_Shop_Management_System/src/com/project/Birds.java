package com.project;

public abstract class Birds extends Pet {

    String species;

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public abstract void fly();
}
