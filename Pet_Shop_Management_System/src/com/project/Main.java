package com.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    PetStorage petStorage = new PetStorage();

    public void handelUserSelection(int choice) {
        UserInterface userInterface = new UserInterface();
        Scanner scanner =new Scanner(System.in);
        String petID = scanner.next();
        switch (choice) {
            case 1:
                     add();
                     break;
            case 2:
                     System.out.println("please enter id of pet you want to remove ");
                     Pet petToRemove = petStorage.getPet(petID);
                     petStorage.remove(petToRemove);
                     break;
            case 3:
                     System.out.println("please enter id of the pet that you want to update ");
                     Pet petToUpdate = petStorage.getPet(petID);
                     update(petToUpdate);
                     break;
            case 4:
                     userInterface.print(petStorage.getPetList());
                     break;
            case 5:
                     break;
            default:
                     System.out.println("Entered choice is invalid, please enter a valid one");
        }
    }

    public void add() {

        Animal dog = new Dog("Dog001");
        dog.breed = "Bulldog";
        dog.age = 2;
        dog.price = 5000;

        Birds duck = new Duck("Duck001");
        duck.species = "BomabayDuck";
        duck.age = 4;
        duck.price = 1750;

        Animal mice = new Mice("Mice001");
        mice.breed = "Hamster";
        mice.age = 3;
        mice.price = 1550;

        Birds pigeon = new Pigeon("Pigeon001");
        pigeon.species = "BombayGold";
        pigeon.age = 1;
        pigeon.price = 700;

        Birds pigeon2 = new Pigeon("Pigeon001");
        pigeon.species = "Bombaybeak";
        pigeon.age = 2;
        pigeon.price = 1700;

        Animal cat = new Cat("Cat001");
        cat.breed = "Persian";
        cat.age = 1;
        cat.price = 15000;

        Birds parrot = new Parrot("Parrot001");
        parrot.species = "RedBeak";
        parrot.age = 1;
        parrot.price = 2000;


        petStorage.add(cat);
        petStorage.add(dog);
        petStorage.add(parrot);
        petStorage.add(mice);
        petStorage.add(duck);
        petStorage.add(pigeon);
        petStorage.add(pigeon2);
    }
    public void update(Pet pet) {

    }

    public static void main(String[] args) {
        System.out.println("Welcome To pet Management System !");

        UserInterface userInterface = new UserInterface();
        Main main = new Main ();

        int choice = 0;
        while (choice != 5) {
            choice = userInterface.showMainMenu();
            main.handelUserSelection(choice);

        }



        /* Animal dog = new Dog("Dog001");
        dog.breed = "Bulldog";
        dog.age = 2;
        dog.price = 5000;

        Birds duck = new Duck("Duck001");
        duck.species = "BomabayDuck";
        duck.age = 4;
        duck.price = 1750;

        Animal mice = new Mice("Mice001");
        mice.breed = "Hamster";
        mice.age = 3;
        mice.price = 1550;

        Birds pigeon = new Pigeon("Pigeon001");
        pigeon.species = "BombayGold";
        pigeon.age = 1;
        pigeon.price = 700;

        Birds pigeon2 = new Pigeon("Pigeon001");
        pigeon.species = "Bombaybeak";
        pigeon.age = 2;
        pigeon.price = 1700;

        Animal cat = new Cat("Cat001");
        cat.breed = "Persian";
        cat.age = 1;
        cat.price = 15000;

        Birds parrot = new Parrot("Parrot001");
        parrot.species = "RedBeak";
        parrot.age = 1;
        parrot.price = 2000;

        PetStorage petStorage = new PetStorage();
        petStorage.add(cat);
        petStorage.add(dog);
        petStorage.add(parrot);
        petStorage.add(mice);
        petStorage.add(duck);
        petStorage.add(pigeon);
        petStorage.add(pigeon2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to pet Management system")
    }




    UserInterface userInterface = new UserInterface();
    //  userInterface.print(petStorage.getPetlist());
        Set<Pet> petList = petStorage.getPetList();
        userInterface.print(petList);

        petStorage.remove(cat);
        System.out.println("After Removing Cat");
        userInterface.print(petList);

        System.out.println("Animals list are");
        userInterface.printAnimals(petList);

        System.out.println("Birds list are");
        userInterface.printBirds(petList);

        System.out.println("Pets that can fly are");
        userInterface.printFlyables(petList);

        System.out.println("Pet that can swim are");
        userInterface.printSwimmables(petList);
         */


    }
}

