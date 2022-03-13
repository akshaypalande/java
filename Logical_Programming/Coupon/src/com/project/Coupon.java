package com.project;

        import java.util.Scanner;
        import java.util.Random;
public class Coupon {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N distinct coupon Number");
        int num=sc.nextInt();
        sc.close();
        generateCoupon(num);

    }

    private static void generateCoupon(int num) {
        int element=0;
        Random random=new Random();
        int ranMaxRange=100;
        int arr[];
        arr=new int[num];

        for (int i=0;i<num;i++)
        {
            boolean isUnique;
            do
            {
                isUnique=true;
                element=random.nextInt(ranMaxRange);
                for(int i1=0;i1<i;i1++)
                {
                    if(arr[i1]==element)
                    {
                        isUnique=false;
                        break;
                    }
                }
            }while(!isUnique);
            arr[i]=element;
        }
        System.out.println("Coupon code is : ");
        for(int k:arr)
            System.out.print(k+" ");

    }

}