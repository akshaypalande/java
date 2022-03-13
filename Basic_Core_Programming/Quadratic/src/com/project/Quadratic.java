package com.project;

import java.util.Scanner;
public class Quadratic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for a,b,c ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double delta=(b*b)-(4*a*c);
        if(delta<0)
        {
            System.out.println("Complex roots");
        }
        else
        {

            double root1=(-b + Math.sqrt(delta))/(2*a);
            double root2=(-b - Math.sqrt(delta))/(2*a);

            System.out.println("Roots are "+root1+" and "+root2);
        }
        sc.close();

    }
}