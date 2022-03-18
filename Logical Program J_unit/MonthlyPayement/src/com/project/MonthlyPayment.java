package com.project;

        import java.util.Scanner;

public class MonthlyPayment
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();

        // Calculate monthly interest rate
        double monthlyRate = annualRate / 1200;

        // Calculate monthly payment
        double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

        // Display monthly payment
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
    }
}