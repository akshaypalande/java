package com.project;

import java.util.Scanner;

public class Factor{

    public static void primeFactor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to Find Factors: ");
        int Number = sc.nextInt();

        for(int i = 1; i <= Number; i++) {
            if(Number%i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        primeFactor();

    }
}