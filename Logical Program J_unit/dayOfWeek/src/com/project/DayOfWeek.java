package com.project;

import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args)
    {
        System.out.println("Program to find a week day with given date");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date of the month ");
        int date=scanner.nextInt();
        System.out.println("Enter the month in value");
        int month=scanner.nextInt();
        System.out.println("Enter the Year");
        int year=scanner.nextInt();

        int Y=year-(14-month)/12;
        int x=Y+Y/4-Y/100-Y/400;
        int M=month+12*((14-month)/12)-2;
        int D=(date+x+31*M/12)%7;

        switch (D)
        {
            case 0: System.out.println("Sunday");
                break;
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
        }
    }
}