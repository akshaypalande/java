package com.project;

        import java.util.Scanner;

public class StockManagement {
    int NumOfStocks1, NumOfShares1, SharePrice1;
    int NumOfStocks2, NumOfShares2, SharePrice2;
    int NumOfStocks3, NumOfShares3, SharePrice3;

    StockManagement() {
        NumOfStocks1 = 200;
        NumOfShares1 = 3;
        SharePrice1 = 7000;
        NumOfStocks2 = 250;
        NumOfShares2 = 7;
        SharePrice2 = 9000;
        NumOfStocks3 = 60;
        NumOfShares3 = 4;
        SharePrice3 = 62000;
    }

    void nameOfStocks(String a, String b, String c) {
        a = "Reliance Share";
        b = "Market Share";
        c = "Bajaj Share";
        System.out.println("Share I have :- " + a + " , " + b + " , " + c);
    }

    void Debit() {
        Scanner sc = new Scanner(System.in);
        Scanner ammount = new Scanner(System.in);
        System.out.println("Enter the share num you want to sell:- ");
        System.out.println("1 for Reliance, 2 for market, 3 for Market");
        int shareName = ammount.nextInt();
//        int shareAmount = ammount.nextInt();
        if (shareName == 1 || shareName == 2 || shareName == 3) {
            System.out.println("Enter share amount :- ");
            int shareAmount = ammount.nextInt();
            if (shareAmount <= SharePrice1 && shareName == 1) {
                System.out.println("You sold Reliance share of amount :- " + shareAmount + " Now Share remaining amount are :- " + (SharePrice1 - shareAmount));
            } else if (shareAmount <= SharePrice2 && shareName == 2) {
                System.out.println("You sold Market share of amount :- " + shareAmount + " Now Share remaining amount are:- " + (SharePrice2 - shareAmount));
            } else if (shareAmount <= SharePrice3 && shareName == 3) {
                System.out.println("You sold Bajaj share of amount :- " + shareAmount + " Now Share remaining amount are:- " + (SharePrice3 - shareAmount));
            } else {

                System.out.println("You dont have that much amount, Enter less amount");
            }
        } else {
            System.out.println("Enter proper number.");
        }
    }

    void Display() {
        int oneStock1 = SharePrice1 / NumOfStocks1;
        int oneShare1 = oneStock1 / NumOfShares1;
        System.out.println("The value of Reliance one Stock:- " + oneStock1 + " and total Stocks I have-> " + NumOfStocks1);
        System.out.println("The value of Reliance one Share:- " + oneShare1 + " and total Stocks I have-> " + NumOfShares1 + " Shares, worth " + SharePrice1 + "rs");
        System.out.println();
        int oneStock2 = SharePrice2 / NumOfStocks2;
        int oneShare2 = oneStock2 / NumOfShares2;
        System.out.println("The value of Market one Stock:- " + oneStock2 + " and total Stocks I have-> " + NumOfStocks2);
        System.out.println("The value of Market one Share:- " + oneShare2 + " and total Stocks I have-> " + NumOfShares2 + " Shares, worth " + SharePrice2 + "rs");
        System.out.println();
        int oneStock3 = SharePrice3 / NumOfStocks3;
        int oneShare3 = oneStock3 / NumOfShares3;
        System.out.println("The value of Bajaj one Stock:- " + oneStock3 + " and total Stocks I have-> " + NumOfStocks3);
        System.out.println("The value of Bajaj one Share:- " + oneShare3 + " and total Stocks I have-> " + NumOfShares3 + " Shares, worth " + SharePrice3 + "rs");
    }

    public static void main(String[] args) {
        StockManagement SAM = new StockManagement();
        SAM.nameOfStocks(" ", " ", " ");
        System.out.println();
        SAM.Display();
        System.out.println();
        SAM.Debit();
    }
}