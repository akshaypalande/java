package com.project;

import java.util.Objects;

public abstract class Pet {
    enum Colour{RED, GREEN, BLUE, WHITE, BROWN, GRAY, BLACK_WHITE}

    public int price;
    String id;
    String name;
    Colour colour;
    int age;
    int Price;

    public abstract void eats();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

