package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         //printInitials();
        //countTheEggs();
        //moneyMakingHuntington();
        //convertingDollars();
       // timeConversion();
        //playMadLibs();
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

    static void convertingDollars (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a dollar amount: ");
        int dollarAmount = scan.nextInt();

        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        System.out.println("You have entered  $" + dollarAmount );

        System.out.println("That is " + numTwenties + " twenties, " + numTens + " tens, " + numFives + " fives, and " + numOnes + " ones.");
    }

    static void timeConversion(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minutes amount : ");
        int minutes = scan.nextInt();
        double hour = minutes/60;
        double day = hour/24;
        System.out.println("You entered "+minutes+" minutes, and that is "+hour+" hours, and "+day+" days.");
        System.out.printf("You entered %s minutes, and that is %.2f hours, and %.2f days.",minutes,hour,day);
    }

    static void playMadLibs(){
        Scanner scan = new Scanner(System.in);

        String noun, noun2,adjective,pastTenseVerb;
        System.out.println("Enter a noun ");
        noun = scan.nextLine();
        System.out.println("Enter a second noun: ");
        noun2 = scan.nextLine();
        System.out.println("Enter an adjective: ");
        adjective=scan.nextLine();
        System.out.println("Enter a past-tense verb: ");
        pastTenseVerb=scan.nextLine();
        System.out.println("Mary had a little " + noun + "\nIts " + noun2 + " was " + adjective + " as snow");
        System.out.println("And everywhere that Mary " + pastTenseVerb);
        System.out.println("The " + noun + " was sure to go.");
    }

}

