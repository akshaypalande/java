package com.project;

import java.util.LinkedList;
        import java.util.Scanner;

public class AdressBook {
    static Scanner scanner = new Scanner(System.in);
    LinkedList<Contacts> person = new LinkedList<>();

    public void addPerson() {
        System.out.println("Enter the First Name");
        String fName = scanner.next();
        System.out.println("Enter the Last Name");
        String lName = scanner.next();
        System.out.println("Enter the Address");
        String address = scanner.next();
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("Enter the State");
        String state = scanner.next();
        System.out.println("Enter the Zip");
        String zip = scanner.next();
        System.out.println("Enter the PhoneNumber");
        String phoneNumber = scanner.next();
        System.out.println("Enter the Email");
        String email = scanner.next();
//creating contacts object and passing arguments inside constructor
        Contacts p = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);
//adding p object into the linked list with Contact class data type
        person.add(p);
//printing person array list
        System.out.println(person);

    }

    ///editing contact by searching names
    public void editPerson() {
        System.out.println("Enter the name to edit");
        String s = scanner.next();

        for (int i = 0; i < person.size(); i++) {
            Contacts p = person.get(i);
            if (s.equals(p.getFirstName())) {
                while (true) {
                    System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)address\n"
                            + "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            p.setFirstName(scanner.next());
                            break;
                        case 2:
                            p.setLastName(scanner.next());
                            break;
                        case 3:
                            p.setAddress(scanner.next());
                            break;
                        case 4:
                            p.setCity(scanner.next());
                            break;
                        case 5:
                            p.setState(scanner.next());
                            break;
                        case 6:
                            p.setZip(scanner.next());
                            break;
                        case 7:
                            p.setPhoneNumber(scanner.next());
                            break;
                        case 8:
                            p.setEmail(scanner.next());
                            break;
                        default:
                            System.out.println("select correct choice");
                            break;
                    }// end of switch
                    if (choice == 9)
                        break;
                } // end while
                person.set(i, p);
                System.out.println("person after editing");
                System.out.println(person);

            } // end of if
        } // end of for loop

    }

    // deleting contact details using person name
    public void deletePerson() {
        System.out.println("Enter the name to search and delete");
        String s = scanner.next();
        for (int i = 0; i < person.size(); i++) {
            Contacts p = person.get(i);
            if (s.equals(p.getFirstName())) {
                person.remove(i);
            }
        }
        System.out.println("contact after deletion");
        if (person.isEmpty() != true)
            System.out.println(person);
        else {
            System.out.println("contacts deleted");
        }
    }

    public void addMultiplePerson() {
        int x = 1;
        while (x != 0) {
            System.out.println(
                    "Enter the option \n1)To Add Contect\n2)To Edit Contact" + "\n3)To Delete Contact\n4)exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> addPerson();
                case 2 -> editPerson();
                case 3 -> deletePerson();
                case 4 -> {
                    System.out.println("exiting");
                    x = 0;
                }
                default -> System.out.println("invalid option");

            }
        }
    }
}