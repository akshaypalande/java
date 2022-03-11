package com.project;

public class employeWage {
    //Class constants
    static final int WAGE = 350;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS =160;

    public static void main(String[] args) {
        //Local Variables
        int workingHours = 8;
        int totalHours = 0;
        int salary = 0;
        int totalDays = 1;
        //Looping for a month


        while (totalDays != MAX_WORKING_DAYS && totalHours != MAX_WORKING_HRS) {
            totalDays++;
            //Performing check
            double empCheck = empChoice();
            //Operations
            switch ((int) empCheck) {
                case 1 -> workingHours = 8;
                case 2 -> workingHours = 4;
                default -> workingHours = 0;
            }
            totalHours += workingHours;
            salary = WAGE * totalHours;
        }
        System.out.println("Total Working Days are " +totalDays);
        System.out.println("Total Working Hours are " + totalHours);
        System.out.println("The total salary is " + salary);
    }
    static double empChoice(){
        return Math.floor((Math.random() * 100) % 3);
    }
}