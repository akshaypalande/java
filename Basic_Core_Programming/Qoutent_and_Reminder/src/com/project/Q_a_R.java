package com.project;

import java.util.Scanner;

public class Q_a_R {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Numerator: ");
        int num = scanner.nextInt();
        System.out.println("Enter the Denominator: ");
        int den = scanner.nextInt();

        if(den != 0){
            int quotient = num / den;
            int remainder = num % den;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
        else {
            System.out.println("Denominator cant be 0");
        }
    }
}

