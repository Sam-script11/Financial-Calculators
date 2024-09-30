package com.pluralsight;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System. in);



        System.out.print("please enter your principal amount: $");
        double principal = keyboard.nextDouble();

        System.out.print("please enter your  annual interest; ");
        float interestRate = keyboard.nextFloat() / 100;

        float MonthlyInterest = (interestRate/12);
        System.out.println("your interest monthly is: "+ MonthlyInterest);


        System.out.print(" please enter your loan term: ");
        int loanTerm = keyboard.nextInt();

        double monthlyPayment = (principal *((Math.pow(1+MonthlyInterest,loanTerm*12))* MonthlyInterest)) / (Math.pow(1+MonthlyInterest,loanTerm*12)-1);

        System.out.println("your monthly payment is: $"+   monthlyPayment);


        double interestPaid = (monthlyPayment * loanTerm*12) - principal;
        System.out.println (" your interest rate paid is $" + interestPaid);



                System.out.println("Your number of payments will be: "+ loanTerm *12);



        System.out.println("A " + principal +" loan  at " + interestRate + "% interest for " +loanTerm +" years would " +
                "have a "+ monthlyPayment + " /mo payment with a total interest rate of $"+ interestPaid +".");

    }
}
