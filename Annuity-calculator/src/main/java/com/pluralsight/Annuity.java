package com.pluralsight;

import java.util.Scanner;

public class Annuity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System. in);

        System.out.print("Please enter your monthly payout: $");
        int monthlyPay = keyboard.nextInt();

        System.out.print("please enter expected interest rate: ");
        float interestRate = keyboard.nextFloat() / 100;

        System.out.print("Please enter years to pay out: ");
        int numberPayments = keyboard.nextInt();

        double presentValue = monthlyPay/interestRate * (1- (1/Math.pow(1+(interestRate/12),(12*20))));

        System.out.print("To fund an annuity that pays "  + monthlyPay + " for " +numberPayments  + " years and " +
                "earns an expected "+interestRate   + "% interest, " +
                "you would need to invest $" + presentValue + " today");

    }
}
