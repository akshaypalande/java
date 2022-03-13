package com.project;

import java.util.Scanner;
class Distance{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of X point");
        int x=sc.nextInt();

        System.out.println("Enter the value of Y point");
        int y=sc.nextInt();
        sc.close();


        float distance = (float) Math.sqrt((x * x) + (y * y));
        System.out.println("Euclidean Distance of (" + x + "," + y + ") is " + distance);
    }
}