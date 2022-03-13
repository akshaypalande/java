package com.project;

        import java.util.Scanner;

public class Alphabet {

    static Scanner keyboard = new Scanner(System.in);

    static boolean isVowel(String letter){
        char[] check = letter.toCharArray();
        char[] vowel = "aeiouAEIOU".toCharArray();
        for (char c : vowel) {
            if (check[0] == c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the letter: ");
        String a = keyboard.next();
        System.out.println(isVowel(a));
    }
}