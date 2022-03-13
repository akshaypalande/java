package com.project;

import java.util.Scanner;
1
public class twoDimensionalArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of array");
        System.out.println("1: Integer  2:Double 3:Boolean");
        int type=sc.nextInt();
        System.out.println("Enter number of rows");
        int m=sc.nextInt();
        System.out.println("Enter number of colums");
        int n=sc.nextInt();
        System.out.println("Enter elements");

        switch (type) {
            case 1: int arr[][]=new int[m][n];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        arr[i][j] = sc.nextInt();
                    }
                }

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(" "+arr[i][j]);
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                double arrD[][] = new double[m][n];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        arrD[i][j] = sc.nextInt();
                    }
                }

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(" "+arrD[i][j]);
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                boolean arrB[][]=new boolean[m][n];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        arrB[i][j] = sc.nextBoolean();
                    }
                }

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(" "+arrB[i][j]);
                    }
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("Invalid input");


                sc.close();

        }
    }

}
