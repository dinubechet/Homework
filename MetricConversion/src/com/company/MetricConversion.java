package com.company;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an amount : ");
        int userInput=scan.nextInt();
        convertFromInchesToCentimeters(userInput);
convertFromGallonsToLiters(userInput);
    }

    public static void convertFromInchesToCentimeters(int amount){
        double converted= amount * 2.54;
        System.out.println(amount + " inches equals "+converted+" centimeters.");
    }

    public static void convertFromGallonsToLiters (int amount){
        double converted = amount * 3.7854;
        System.out.println(amount + " gallons equals "+converted+" liters.");
    }
}
