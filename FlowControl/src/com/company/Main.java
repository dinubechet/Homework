package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        //  identifyOddOrEvenInteger();
        compareIntegers();
        // chooseBestPlan();
        // guessTheLottery();
        // playingRockPaperScissors();
        //drawOs();
        //countTheYearsBetweenMexAndUsa();
        // basketballScoresInStars();
        //theGAME();
    }

    static void identifyOddOrEvenInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int userinput = scan.nextInt();
        if (userinput % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }

    static void compareIntegers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert the first number : ");
        int firstInput = scan.nextInt();
        System.out.println("Please insert the second number : ");
        int secondInput = scan.nextInt();
        System.out.println("Please insert the third number : ");
        int thirdInput = scan.nextInt();
        if (firstInput > secondInput && secondInput > thirdInput) {
            System.out.println(firstInput + " , " + secondInput + " , " + thirdInput);
            System.out.println(thirdInput + " , " + secondInput + " , " + firstInput);
        } else if (secondInput > firstInput && firstInput > thirdInput) {
            System.out.println(secondInput + " , " + firstInput + " , " + thirdInput);
            System.out.println(thirdInput + " , " + firstInput + " , " + secondInput);
        } else if (thirdInput > secondInput && secondInput > firstInput) {
            System.out.println(thirdInput + " , " + secondInput + " , " + firstInput);
            System.out.println(firstInput + " , " + secondInput + " , " + thirdInput);
        } else {
            System.out.println(firstInput + " , " + thirdInput + " , " + secondInput);
            System.out.println(secondInput + " , " + secondInput + " , " + firstInput);
        }
    }

    static void chooseBestPlan() {
        int min, message, gigab;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter minutes : ");
        min = sc.nextInt();
        System.out.print("enter messages : ");
        message = sc.nextInt();
        System.out.print("enter gigabytes : ");
        gigab = sc.nextInt();
        if (min < 500 && message == 0 && gigab == 0) System.out.println("Plan A, 49$ per month");
        if (min < 500 && message > 0 && gigab == 0) System.out.println("Plan B, 55$ per month");
        if (min >= 500 && gigab == 0 && message <= 100 && message > 0) System.out.println("Plan C, 61$ per month");
        if (min >= 500 && gigab == 0 && message > 100) System.out.println("Plan D, 70$ per month");
        if (gigab > 0 && gigab < 2) System.out.println("Plan E, 79$ per month");
        if (gigab > 0 && gigab >= 2) System.out.println("Plan F, 87$ per month");
    }

    static void guessTheLottery() {
        int totalMatch = 0;
        int award = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int firstRandom = rand.nextInt(9);
        int secondRandom = rand.nextInt(9);
        int thirdRandom = rand.nextInt(9);
        System.out.println(firstRandom);
        System.out.println(secondRandom);
        System.out.println(thirdRandom);
        System.out.println("Please try to guess the first number : ");
        int guessOne = scan.nextInt();
        System.out.println("Please try to guess the second number : ");
        int guessTwo = scan.nextInt();
        System.out.println("Please try to guess the last number : ");
        int guessThree = scan.nextInt();

        if (firstRandom == guessOne) {
            if (secondRandom == guessTwo) {
                if (thirdRandom == guessThree) {
                    award = 1000000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (secondRandom == guessThree) {
                if (thirdRandom == guessTwo) {
                    award = 1000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (thirdRandom == guessThree || thirdRandom == guessTwo) {
                award = 100;
                System.out.println("You won " + award);
            } else {
                award = 10;
                System.out.println("You won " + award);
            }
        } else if (firstRandom == guessTwo) {
            if (secondRandom == guessOne) {
                if (thirdRandom == guessThree) {
                    award = 1000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (secondRandom == guessThree) {
                if (thirdRandom == guessOne) {
                    award = 1000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (thirdRandom == guessOne || thirdRandom == guessThree) {
                award = 100;
                System.out.println("You won " + award);
            } else {
                award = 10;
                System.out.println("You won " + award);
            }
        } else if (firstRandom == guessThree) {
            if (secondRandom == guessOne) {
                if (thirdRandom == guessTwo) {
                    award = 1000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (secondRandom == guessTwo) {
                if (thirdRandom == guessOne) {
                    award = 1000;
                    System.out.println("You won " + award);
                } else {
                    award = 100;
                    System.out.println("You won " + award);
                }

            } else if (secondRandom == guessOne || secondRandom == guessTwo) {
                award = 100;
                System.out.println("You won " + award);
            } else {
                award = 10;
                System.out.println("You won " + award);
            }
        }
    }

    static void playingRockPaperScissors() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Play Rock Paper and Scissors by using 1 for rock 2 for paper and 3 for scissors");
        int computerChoice = rand.nextInt(3) + 1;
        int userChoice = scan.nextInt();
        System.out.println(computerChoice);

        // 1 = rock , 2 = paper , 3 = scissors
        if (computerChoice == 1 && userChoice == 2) {
            System.out.println("Player won by choosing paper to beat rock!");
            playingRockPaperScissors();
        } else if (computerChoice == 2 && userChoice == 3) {
            System.out.println("Player won by choosing rock to beat scissors!");
            playingRockPaperScissors();
        } else if (computerChoice == 3 && userChoice == 1) {
            System.out.println("Player won by choosing scissors to beat paper!");
            playingRockPaperScissors();
        } else if (computerChoice == 1 && userChoice == 2) {
            System.out.println("Computer won by choosing rock to beat scissors!");
            playingRockPaperScissors();
        } else if (computerChoice == 2 && userChoice == 1) {
            System.out.println("Computer won by choosing paper to beat rock!");
            playingRockPaperScissors();
        } else if (computerChoice == 3 && userChoice == 2) {
            System.out.println("Computer won by choosing scissors to beat paper!");
            playingRockPaperScissors();
        } else if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
            playingRockPaperScissors();
        }
    }

    static void drawOs() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {

                if (j != i) {

                    System.out.print(" ");

                } else if (j == i) {

                    System.out.print("O");

                }
            }
            System.out.println();
        }
    }

    static void countTheYearsBetweenMexAndUsa() {
        double usaPopulation = 315_000_000;
        double mexPopulation = 121_000_000;
        double years = 0;
        while (usaPopulation > mexPopulation) {
            usaPopulation = -(usaPopulation * 0.0015);
            mexPopulation = +(mexPopulation * 0.0101);
            years++;

        }
        System.out.println(years);
    }

    static void basketballScoresInStars() {
        Scanner scan = new Scanner(System.in);
        int counterForArt = 1;
        int counterForBob = 1;
        int counterForCal = 1;
        int counterForDan = 1;
        int counterForEli = 1;

        System.out.println("Enter points scored by Art >> ");
        int art = scan.nextInt();
        System.out.println("Enter points scored by Bob >> ");
        int bob = scan.nextInt();
        System.out.println("Enter points scored by Cal >> ");
        int cal = scan.nextInt();
        System.out.println("Enter points scored by Dan >> ");
        int dan = scan.nextInt();
        System.out.println("Enter points scored by Eli >> ");
        int eli = scan.nextInt();
        System.out.print("Art  ");
        for (; counterForArt <= art; counterForArt++) {
            System.out.print("*");

        }
        System.out.println();
        System.out.print("Bob  ");
        for (; counterForBob <= bob; counterForBob++) {
            System.out.print("*");

        }
        System.out.println();
        System.out.print("Cal  ");
        for (; counterForCal <= cal; counterForCal++) {
            System.out.print("*");

        }
        System.out.println();
        System.out.print("Dan  ");
        for (; counterForDan <= dan; counterForDan++) {
            System.out.print("*");

        }
        System.out.println();
        System.out.print("Eli  ");
        for (; counterForEli <= eli; counterForEli++) {
            System.out.print("*");

        }
    }

    static void theGAME() {
        Scanner scan = new Scanner(System.in);

        int total = 0;

        System.out.println("Input a number from 1, 2, 3 : ");

        while (total < 21) {
            int userInput = scan.nextInt();
            total += userInput;

            if (total == 1) {

                total += 1;
                System.out.println("I add 1! " + "Total number now is : " + total);
                continue;
            }
            if (total == 2) {
                total += 3;
                System.out.println("I add 3! " + "Total number now is : " + total);
                continue;
            }
            if (total == 3) {
                total += 2;
                System.out.println("I add 2! " + "Total number now is : " + total);
                continue;
            }
            if (total == 4) {
                total += 1;
                System.out.println("I add 1! " + "Total number now is : " + total);
                continue;
            }
            total += 4 - userInput;
            System.out.println("I add " + (4 - userInput) + " ! Total number now is : " + total);
        }
        System.out.println("You lost !");
    }

}