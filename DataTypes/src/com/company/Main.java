package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         //printInitials();
        //countTheEggs();
         moneyMakingHuntington();
    }

    static void printInitials() {
        char initial1 = 'D';
        char initial2 = 'B';
        char initial3 = 'P';
        System.out.println(initial1 + "." + initial2 + "." + initial3 + ".");
    }

    static void countTheEggs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of eggs : ");
        int userinput = scan.nextInt();
        int doz = userinput / 12, unit = userinput - doz * 12;
        System.out.println("You ordered " + userinput + " eggs. That's " + doz + " dozens plus " + unit + " eggs. That's $" + (doz * 3.25 + unit * 0.45));
    }

    static void moneyMakingHuntington (){
        int adultMeal = 7;
        int childMeal = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell us how many adult meals you want : ");
        int numberOfAdultMeals = scan.nextInt();
        System.out.println("Please tell us how many child meals you want : ");
        int numberOfChildMeals = scan.nextInt();
        int adultMoney = adultMeal*numberOfAdultMeals;
        int childMoney = childMeal*numberOfChildMeals;
        int totalMoney = adultMoney+childMoney;
        System.out.println("You ordered adult meals in the sum of "+adultMoney+" $, child meals in the sum of "+childMoney+"$, with a total of "+totalMoney+" $");

    }

}

