package com.project;


import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class AddressBookSystem {

    public static ArrayList<Contacts> contactList = new ArrayList<>();

    public static Map<String, Contacts> nameHashMap = new HashMap<String, Contacts>();

    public static Map<String, Contacts> cityHashMap = new HashMap<String, Contacts>();

    public static Map<String, Contacts> stateHashMap = new HashMap<String, Contacts>();

    static Scanner sc = new Scanner(System.in);
    static AddressBookSystem addressBook = new AddressBookSystem();


    public boolean addContact(Contacts contact) {
        List<Contacts> checkByName = searchByName(contact.getFirstName());
        for (Contacts equalName : checkByName)
            if (equalName.equals(contact))
                return false;
        contactList.add(contact);
        return true;
    }

    public List<Contacts> searchByName(String name) {

        return contactList.stream().filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }


    public List<Contacts> searchByCity(String city) {
        return contactList.stream().filter(person -> person.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }


    public List<Contacts> searchByState(String state) {
        return contactList.stream().filter(person -> person.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }


    public static void viewByName(Map<String, Contacts> nameHashMap) {
        nameHashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue().toString()));
    }

    public static void viewByCity(Map<String, Contacts> cityHashMap) {
        cityHashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue().toString()));
    }

    public static void viewByState(Map<String, Contacts> stateHashMap) {
        stateHashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue().toString()));
    }

    public static List<Contacts> sortBy(Function<? super Contacts, ? extends String> key) {
        return contactList.stream().sorted(Comparator.comparing(key)).collect(Collectors.toList());
    }

    public static List<Contacts> sortByZip(Function<? super Contacts, ? extends Long> key) {
        return contactList.stream().sorted(Comparator.comparing(key)).collect(Collectors.toList());
    }


    public boolean editContact(Contacts current, Contacts edit) {

        if (!contactList.contains(current))
            return false;

        contactList.remove(current);

        contactList.add(edit);

        return true;
    }


    public boolean deleteContact(Contacts contacts) {

        contactList.remove(contacts);
        return true;
    }


    @Override
    public String toString() {

        if (contactList.isEmpty())
            return "No contacts found!";
        String result = new String();
        /**
         * using for loop check the condition and search the contactList in specific position
         * then update
         */
        for (int i = 0; i < contactList.size(); i++) {
            result += " " + contactList.get(i);
        }
        return result;
    }


    public static Contacts readContact() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip Code: ");
        int zip = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        return new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
    }

    public static void addressBookOptions(AddressBookSystem addressBook) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\n-------------------------- Address Book Contact Option --------------------------");
            System.out.println("1. Add contact details");
            System.out.println("2. Edit contact details");
            System.out.println("3. Delete contact details");
            System.out.println("4. Show contacts details");
            System.out.println("5. Back to main menu");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    if (addressBook.addContact(readContact()))
                        System.out.println("Contact Added Successfully....!");
                    else
                        System.out.println("Contact Already Exist....!");
                    break;
                case 2:
                    System.out.println("Enter First name to edit contact: ");
                    String name = sc.nextLine();

                    List<Contacts> equalName = addressBook.searchByName(name);

                    if (equalName.isEmpty())
                        System.out.println("Data Not Found....!");

                    else if (equalName.size() == 1) {

                        addressBook.editContact(equalName.get(0), readContact());

                        System.out.println("Contact data modified....!");
                    } else {

                        equalName.forEach(x -> System.out.println(equalName.indexOf(x) + "  " + x.toString()));
                        System.out.println("Enter index to edit : ");
                        int i = sc.nextInt();
                        sc.nextLine();
                        addressBook.editContact(equalName.get(i), readContact());
                        System.out.println("Contact Modified....!");
                    }
                    break;
                case 3:
                    System.out.println("Enter First name to delete contact: ");
                    name = sc.nextLine();
                    equalName = addressBook.searchByName(name);
                    if (equalName.isEmpty())
                        System.out.println("Data Not Found.....!");
                    else if (equalName.size() == 1) {
                        addressBook.deleteContact(equalName.get(0));
                        System.out.println("Contact data deleted....!");
                    } else {
                        equalName.forEach(x -> System.out.println(equalName.indexOf(x) + "  " + x.toString()));
                        System.out.println("Enter an index to delete");
                        int index = sc.nextInt();
                        sc.nextLine();
                        addressBook.deleteContact(equalName.get(index));
                        System.out.println("Contact data deleted....!");
                    }
                    break;
                case 4:

                    System.out.println(addressBook.toString());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }


    public void searchByOptions() {

        AddressBookSystem addressBook = new AddressBookSystem();

        Scanner sc = new Scanner(System.in);

        System.out.println("1. By name");
        System.out.println("2. By city");
        System.out.println("3. By state");
        System.out.println("4. Back");
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                contactList.forEach(book -> searchByName(name).forEach(System.out::println));
                break;
            case 2:
                System.out.println("Enter city: ");
                String city = sc.nextLine();
                contactList.forEach(book -> searchByCity(city).forEach(System.out::println));
                break;
            case 3:
                System.out.println("Enter state: ");
                String state = sc.nextLine();
                contactList.forEach(book -> searchByState(state).forEach(System.out::println));
                break;
            case 4:
                return;
            default:
                System.out.println("INVALID CHOICE!");
        }
    }


    public static void viewByOption(Map<String, AddressBookSystem> addressBookMap) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. View By name");
        System.out.println("2. View By city");
        System.out.println("3. View By state");
        System.out.println("4. Back");

        System.out.print("Enter Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                viewByName(nameHashMap);
                break;
            case 2:
                viewByCity(cityHashMap);
                break;
            case 3:
                viewByState(stateHashMap);
                break;
            case 4:
                return;
            default:
                System.out.println("INVALID CHOICE!");
        }
    }


    public void countByOption() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Count City ");
        System.out.println("2. Count State");
        System.out.println("3. Back ");

        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        /**
         * using switch case
         */
        switch (choice) {
            case 1:

                Map<String, Long> countCity = contactList.stream()
                        .collect(Collectors.groupingBy(e -> e.getCity(), Collectors.counting()));
                System.out.println(countCity + "\n");
                break;
            case 2:
                Map<String, Long> countState = contactList.stream()
                        .collect(Collectors.groupingBy(e -> e.getState(), Collectors.counting()));
                System.out.println(countState + "\n");
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Option");
        }
    }


    public static void sortByOption() {

        System.out.println("1. By first name");
        System.out.println("2. By last name");
        System.out.println("3. By city");
        System.out.println("4. By state");
        System.out.println("5. By zip");
        System.out.println("6. Back");

        System.out.print("Your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                AddressBookSystem.sortBy(Contacts::getFirstName).forEach(System.out::println);
                break;
            case 2:
                AddressBookSystem.sortBy(Contacts::getLastName).forEach(System.out::println);
                break;
            case 3:
                AddressBookSystem.sortBy(Contacts::getCity).forEach(System.out::println);
                break;
            case 4:
                AddressBookSystem.sortBy(Contacts::getState).forEach(System.out::println);
                break;
            case 5:
                return;
            default:
                System.out.println("INVALID CHOICE!");
        }
    }
}