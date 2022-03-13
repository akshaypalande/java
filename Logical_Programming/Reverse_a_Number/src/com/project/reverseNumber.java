package com.project;

        import java.util.Scanner;
public class reverseNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num=sc.nextInt();
        System.out.println("Reversed number is : "+getReversed(num));
        sc.close();
    }

    private static int getReversed(int num) {
        int rev=0;
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        return rev;
    }

}