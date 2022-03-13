package com.project;

        import java.util.Scanner;
public class primeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        checkIsPrime(num);
        sc.close();
    }

    public static void checkIsPrime(int num) {
        int check = 1;
        if(num<=1)
        {
            if(num==1)
            {
                System.out.println("Not prime");
                System.exit(0);
            }
            else
            {
                System.out.println("invalid input");
                System.exit(0);
            }
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                check=0;
        }
        System.out.println((check==0)?"Not prime":"Prime number");

    }
}
