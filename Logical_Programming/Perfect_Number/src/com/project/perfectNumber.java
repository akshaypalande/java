package com.project;

        import java.util.Scanner;
public class perfectNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        checkPerfact(num);
        sc.close();
    }

    private static void checkPerfact(int num) {
        int sum=0;
        for (int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        System.out.println((sum==num)?"Perfact number":"Not perfact number");

    }

}