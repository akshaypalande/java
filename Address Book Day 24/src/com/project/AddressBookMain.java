package com.project;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



        public class AddressBookMain {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                AddressBookSystem addressBook = new AddressBookSystem();

                Map<String, AddressBookSystem> addressBookMap = new HashMap<String, AddressBookSystem>();

                while (true) {

                    System.out.println("\nWelcome to Address Book System");

                    System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5.View Contact Data \n6.Count Contacts \n7. Exit");

                    System.out.print("Enter Your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter Name of new Address Book: ");
                            String bookName = sc.next();
                            sc.nextLine();

                            addressBookMap.put(bookName, new AddressBookSystem());

                            AddressBookSystem.addressBookOptions(addressBookMap.get(bookName));
                            break;
                        case 2:
                            System.out.println("List of available Address Book : ");

                            Set<String> keys = addressBookMap.keySet();
                            Iterator<String> i = keys.iterator();
                            while (i.hasNext()) {
                                System.out.println(i.next());
                            }
                            System.out.println("Enter Address Book name you want to Open : ");
                            String name = sc.nextLine();
                            System.out.println("Current Address Book is : " + name);

                            AddressBookSystem.addressBookOptions(addressBookMap.get(name));
                            break;
                        case 3:
                            System.out.println("Enter Address Book name to be delete: ");
                            name = sc.nextLine();

                            addressBookMap.remove(name);
                            break;
                        case 4:
                            System.out.println("Welcome to the search option:");
                            addressBook.searchByOptions();
                        case 5:
                            System.out.println("Welcome to view By Option:");
                            addressBook.viewByOption(addressBookMap);
                            break;
                        case 6:
                            System.out.println("Welcome to the counter");
                            addressBook.countByOption();
                            break;
                        case 7:

                            sc.close();
                            return;

                        default:
                            System.out.println("You Entered Invalid Choice....!");
                            break;
                    }
                }
            }
        }

