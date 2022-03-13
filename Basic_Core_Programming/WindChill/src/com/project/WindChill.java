package com.project;

import java.util.Scanner;
public class WindChill {

    public static void main(String[] args) {

        System.out.println("Calculating WindChill using Equation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of temperature 't' (<50) in Fahrenheit");
        int t=scanner.nextInt();

        System.out.println("Enter the value of speed 'v' (3<'v'<120) in Fahrenheit");
        int v=scanner.nextInt();
        scanner.close();

        if (t < 50 && v > 3 && v < 120) {
            double wc = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("WindChill is " + wc);
        } else {
            System.out.println("Enter the values of temperature and speed in given range");
        }

    }
}