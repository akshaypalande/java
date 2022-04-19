package com.project;

import java.util.ArrayList;
import java.util.HashSet;
import  java.util.Set;

public class PetStorage {
    //private ArrayList<Pet> petList = new ArrayList();

    private Set<Pet> petList = new HashSet();

    public void add(Pet pet) {
        petList.add(pet);
    }

    public Set<Pet> getPetList() {
        return petList;
    }

    public void remove(Pet pet) {
        petList.remove(pet);

    }

    public Pet getPet(String petID){
        for (Pet pet: petList) {
            if(petID.equals(pet.id)){
                return pet;
            }
        }
        return null;
    }
}

// read functions and data types, for each loops, creating methods