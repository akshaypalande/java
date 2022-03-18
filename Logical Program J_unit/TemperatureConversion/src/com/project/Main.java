package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

package javapractice;

        import java.util.Scanner;

public class TemperatureConversion {
    static double f = 0;
    static double c = 0;

    public static double FahrenheittoCelsius() {
        c = (f - 32) * 5 / 9;
        return c;
    }

    public static double CelsiustoFahrenheit() {
        f = ((9 * c) / 5) + 32;
        return f;
    }

    public static void choice() {
        double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter  Fahrenheit temperature");
                f = sc.nextDouble();
                c = FahrenheittoCelsius();
                System.out.println("Celsius temperature is = " + c);
                break;
            case 2:
                System.out.println("Enter  Celsius temperature");
                c = sc.nextDouble();
                f = CelsiustoFahrenheit();
                System.out.println("Fahrenheit temperature is = " + f);
                break;
            default:
                System.out.println("please choose valid choice");
        }

    }

    public static void main(String[] args) {
        choice();
    }
}
© 2022 GitHub, Inc.