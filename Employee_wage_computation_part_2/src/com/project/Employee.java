package com.project;

public class Employee {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    static void totalEmpWage(int ratePerHr, int numOfDays, int hrsInMonth) {
        //VARIABLES
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //COMPUTATION
        while (totalEmpHrs <= hrsInMonth && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + " Emp Hours: " + empHrs);
        }
        int totalWage = totalEmpHrs * ratePerHr;
        System.out.println("Total Emp Wage for company company is " + totalWage);
    }

    public static void main(String args[]) {
        //Multiple Company data
        totalEmpWage(20,20,100);
        totalEmpWage(15, 25, 120);
    }
}