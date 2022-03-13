package com.project;

    import java.util.Scanner;

public class Harmonic_Number
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Nth Value : ");
        double n = in.nextInt();
        double i;
        double sum=0;

        for( i=1;i<=n;i++)
            in.close();
        {
            sum=sum+(1/i);

        }
        System.out.println("Harmonic value = "+sum);

    }

}