package com.project;

import java.util.Scanner;

public class Leap_Year {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    static boolean isLeapYear(int year){
        boolean check = false;
        if (year % 4 == 0) {
            check = true;
            if (year % 100 == 0) {
                check = (year % 400 == 0);
            }
        }
        return check;
    }
}

