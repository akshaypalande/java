package com.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    public void print(Set<Pet> petList) {
       /* for(int i = 0; i < petList.size(); i++) {
            System.out.println(petList.get(i));
        }*/

        for(Pet o: petList) {
            System.out.println(o);
        }
    }

    // obj instanceof Animal
    public void printAnimals(Set<Pet> petList) {
        for(Pet o: petList) {
            if(o instanceof Animal) {
                System.out.println(o);
            }
        }
    }

    public void printBirds(Set <Pet> petList) {
        for(Pet o: petList) {
            if(o instanceof Birds) {
                System.out.println(o);
            }
        }
    }

    public void printSwimables(Set<Pet> petList) {
        for (Pet o: petList) {
            if (o instanceof Swimable){
                System.out.println(o);
            }
        }
    }

    public void printFlyables(Set<Pet> petList) {
        for (Pet o: petList) {
            if (o instanceof Flyable){
                System.out.println(o);
            }
        }
    }

    public int showMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option\n 1- Add, 2-Remove, 3-Update, 4-Display, 5_Exit");
        int choice = scanner.nextInt();
        return choice;
    }
}

