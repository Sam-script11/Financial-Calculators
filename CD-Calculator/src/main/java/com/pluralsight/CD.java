package com.pluralsight;

import java.util.Scanner;

public class CD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System. in);

        //asking the user to input principal amount
        System.out.print("please enter your principal: $" );
        double principal = keyboard.nextDouble();

        // asking user how long they want their CD to be
        System.out.print("please enter your CD term: ");
        int Term = keyboard.nextInt();

        // will take the APY and will be divided by 100 to get the decimal
        System.out.print("please enter your annual percentage yield( APY): ");
        float apy = keyboard.nextFloat() /100;

        /* formula for future value which is principal times 1 +apy divide by 365( calculating daily and there is 365 days in a year
         to the power for years
         */


        double FutureValue = principal * (Math.pow(1+apy/365, 365*Term));

        // taking the future value subtracting the principal will get you the profit
        double Profit = FutureValue - principal;

        // format in a sentence structure
        System.out.println("If you deposit $"+ principal + " in a CD that earns : " + apy + " interest and " +
                "matures in " + Term +" years, " +
                "your CD's ending balance will be " + FutureValue + " and you would have earned $"+ Profit +
                " in interest");











    }
}
