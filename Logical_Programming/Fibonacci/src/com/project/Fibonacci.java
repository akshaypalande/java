package com.project;
        import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of series ");
        int length=sc.nextInt();
        printSeries(length);
        sc.close();
    }

    private static void printSeries(int length) {
        int num1=0,num2=1;
        int sum=0;
        for(int i=0;i<length;i++)
        {
            System.out.print(num1+" ");
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }

    }

}