
package com.project;

        import java.util.Scanner;

public class toBinary {
    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(" " + (num >> i & 1));
        }
        System.out.printf("\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printBinary(num);
        scanner.close();
    }

}