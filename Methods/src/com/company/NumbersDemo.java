package com.company;

public class NumbersDemo {

    public static void main(String[] args) {

        int firstInt = 2;
        int secondInt = 3;

        displayTwiceTheNumber(firstInt, secondInt);
        displayNumberPlusFive(firstInt, secondInt);
        displayNumberSquared(firstInt, secondInt);
    }

    public static void displayTwiceTheNumber(int num1, int num2) {

        System.out.println(num1 + " , " + num1);
        System.out.println(num2 + " , " + num2);
    }

    public static void displayNumberPlusFive(int numb1, int numb2) {

        int numb1PlusFive = numb1 + 5;
        int numb2PlusFive = numb2 + 5;

        System.out.println("The number + 5 = " + numb1PlusFive);
        System.out.println("The number + 5 = " + numb2PlusFive);
    }

    public static void displayNumberSquared(int numbr1, int numbr2) {

        numbr1 = numbr1 * numbr1;
        numbr2 = numbr2 * numbr2;

        System.out.println("Number's square is = " + numbr1);
        System.out.println("Number's square is = " + numbr2);

    }
}
