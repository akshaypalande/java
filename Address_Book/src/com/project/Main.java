package com.project;

        import java.util.HashMap;
        import java.util.LinkedList;
        import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    LinkedList<AdressBook> addressbooks = new LinkedList<>();
    HashMap<Integer, AdressBook> addressbookNum = new HashMap<>();

    public void addMultipleAddressBook() {

        while (true) {

            System.out.println("Enter the \n1)to access address book\n2)0 to exit");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exiting from addressbooks");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Enter the addressbook number");
                    int N = scanner.nextInt();
                    System.out.printf("welcome to addressbook_%d\n", N);
                    if (addressbookNum.containsKey(N)) {
                        System.out.printf("addressbook_%d is already present you cannot add one more time\n", N);
                        break;
                    } else {
                        AdressBook addr = new AdressBook();
                        addr.addMultiplePerson();
                        addressbookNum.put(N, addr);
                        break;
                    }

                default:
                    System.out.println("select valid option");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Start with Displaying Welcome to Address Book Program in AddressBookMain class");
        Main main = new Main();
        main.addMultipleAddressBook();
    }

}