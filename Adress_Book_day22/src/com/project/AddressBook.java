package com.project;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddressBook {

    static List<Contact> addressBook;

    public static void main(String[] args) {
        addressBook = new LinkedList<Contact>();

        boolean isExit = false;

        System.out.println("Welcome to the Address book, Manage your Contacts");
        Scanner scanner = new Scanner(System.in);
        while(!isExit) {
            System.out.println("Select the option from below");
            if (addressBook.isEmpty()) {
                System.out.println("1.Add Contact" + "\n5. Exit");
            } else {
                System.out.println(
                        "1. Add Contact" + "\n2. Display Contact\n3. Edit Contact" + "\n4. Delete Contact\n5. Exit");
            }

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    addContact(scanner);
                    break;
                case "2":
                    showContacts();
                    break;
                case "3":
                    editContact(scanner);
                    break;

                case "4":
                    deleteContact(scanner);
                    break;

                case "5":
                    isExit = true;
                    showContacts();
                    break;

                default:
                    System.out.println("Invalid option choosed.");
                    break;

            }
        }

            scanner.close();
        }
    private static void deleteContact(Scanner scanner) {
        System.out.println("Which contact you want to Delete? (Enter the First name)");
        String firstName = scanner.nextLine();

        Contact deleteContact = null;
        for (int i = 0; i < addressBook.size(); i++) {
            if (firstName.equals(addressBook.get(i).getFirstName())) {
                deleteContact = addressBook.remove(i);
            }
        }

        if (deleteContact == null) {
            System.out.println("No contact found with name " + firstName + ".");
        } else {
            System.out.println(deleteContact.getFirstName() + "'s contact has been removed from your Address Book.");
        }
    }

    private static void editContact(Scanner scanner) {
        System.out.println("Which contact you want to Edit? (Enter the First name)");
        String firstName = scanner.nextLine();

        Contact editContact = null;
        for (int i = 0; i < addressBook.size(); i++) {
            if (firstName.equals(addressBook.get(i).getFirstName())) {
                editContact = addressBook.get(i);
            }
        }

        if (editContact == null) {
            System.out.println("No contact found with name " + firstName + ".");
        } else {
            editContactDetails(editContact, scanner);
        }
    }

    private static void editContactDetails(Contact editContact, Scanner scanner) {
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        editContact.setFirstName(validateFirstName(firstName, scanner));

        System.out.println("Enter Your Email: ");
        String email = scanner.nextLine();
        editContact.setEmail(validateEmail(email, scanner));

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        editContact.setPhoneNumber(validatePhone(phoneNumber, scanner));

        System.out.println("Contact has been edited.");
    }

    private static void showContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            for (Contact contact : addressBook) {
                System.out.println(contact);
            }
        }
    }

    private static void addContact(Scanner scanner) {
        Contact contact = new Contact();

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        contact.setFirstName(validateFirstName(firstName, scanner));

        System.out.println("Enter Your Email: ");
        String email = scanner.nextLine();
        contact.setEmail(validateEmail(email, scanner));

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        contact.setPhoneNumber(validatePhone(phoneNumber, scanner));

        addressBook.add(contact);
        System.out.println("Contact has been saved.");
    }

    public static String validateFirstName(String firstName, Scanner scanner) {
        String resultPattern = "^[A-Z]{1}[a-z]{2,9}$";
        Pattern regex = Pattern.compile(resultPattern);
        Matcher inputMatcher = regex.matcher(firstName);

        while (!inputMatcher.matches()) {
            System.out.println("Error: Invalid first name, please try again");
            System.out.println("length must not exceeds 10 (Exa: Darpan)");
            firstName = scanner.nextLine();
            inputMatcher = regex.matcher(firstName);
        }
        return firstName;
    }

    public static String validateEmail(String email, Scanner scanner) {
        String resultPattern = "^[a-z.]{2,30}@{1}[a-z]{3,10}.[a-z]{3}$";
        Pattern regex = Pattern.compile(resultPattern);
        Matcher inputMatcher = regex.matcher(email);

        while (!inputMatcher.matches()) {
            System.out.println("Error: Invalid Email, please try again");
            email = scanner.nextLine();
            inputMatcher = regex.matcher(email);
        }
        return email;
    }

    public static String validatePhone(String phone, Scanner scanner) {
        String resultPattern = "^[+]{0,1}[0-9]{0,2}[0-9]{10}$";
        Pattern regex = Pattern.compile(resultPattern);
        Matcher inputMatcher = regex.matcher(phone);

        while (!inputMatcher.matches()) {
            System.out.println("Error: Invalid Phone number, please try again");
            phone = scanner.nextLine();
            inputMatcher = regex.matcher(phone);
        }
        return phone;
    }
}




