package com.project;

import java.util.Arrays;
import java.util.Scanner;

public class  VendingMachine {
    static Scanner sc = new Scanner(System.in);

    static int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
    static int[] noteCounter = new int[8];
    static int[] noteCounter2 = new int[8];
    static int i = 0; //recursion counter
    static int notesUsed = 0;

    public static void countCurrency(int amount) {
        // count notes using Greedy approach
        for (int i = 0; i < 8; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
    }


    public static int recursionMethod(int amount) {
        if (amount == 0) {
            return notesUsed;
        } else if (amount >= notes[i]) {
            noteCounter2[i] = amount / notes[i];
            notesUsed += noteCounter2[i];
//            System.out.println("Reduced Amount: " + noteCounter[i] * notes2[i]);
            amount = amount - noteCounter2[i] * notes[i];
            i++;
        } else {
            i++;
        }
        return recursionMethod(amount);
    }

    // driver function
    public static void main(String[] args) {
        System.out.print("Enter the Change: ");
        int amount = sc.nextInt();
        countCurrency(amount);
        int n = recursionMethod(amount);
        System.out.println("Notes Used : " + n);
        System.out.println("Notes : " + Arrays.toString(notes));
        System.out.println("Result by for Loop : " + Arrays.toString(noteCounter));
        System.out.println("Result by recursion    : " + Arrays.toString(noteCounter2));
    }
}