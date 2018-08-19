package com.company;


import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
      // Diamond.printDiamond(5);

       // drawSqaure();

       // doubleIt(1);

      //  tabularOutput(1);

       // daysOfXmas(1);

        //insertNumber();
    }

    static void insertNumber() {
        System.out.println("Insert a five digit number : ");
        Scanner forPolindrome = new Scanner (System.in);
        int polindromeInsert = forPolindrome.nextInt();
        if (polindromeInsert < 10000 || polindromeInsert > 99999 ){
            System.out.println("Please insert a five digit number only :");
            insertNumber();
        }
        else {
            Diamond.polindromCheck(polindromeInsert);
        }
    }

    static void drawSqaure() {
        System.out.println("Input your number :");
        Scanner forSquare = new Scanner (System.in);
        int imputNumber = forSquare.nextInt();
        if (imputNumber <1 || imputNumber >20 ) {
            System.out.println("You number is not between 1 and 20");
            drawSqaure();
        }else {
            Diamond.square(imputNumber);

        }
    }

    static void printDiamond ( int height ) {

        int width = height * 2 - 1;

        for ( int i = 0; i < height; i++ ) {

            for ( int j = 0; j <= width + 1; j++ ) {

                if ( j >= height - i && j <= height + i ) {

                    System.out.print( "*" );
                }
                else {

                    System.out.print( " " );
                }
            } // end inner for loop

            System.out.println();
        } // end outer for loop

        // *****************************************************

        //for ( int i = height - 1; i >= 0; i-- ) {
        for ( int i = height; i >= 0; i-- ) {

            for ( int j = 0; j <= width + 1; j++ ) {

                if ( j >= height - i && j <= height + i ) {

                    System.out.print( "*" );
                }
                else {

                    System.out.print( " " );
                }
            } // end inner for loop

            System.out.println();
        } // end outer for loop
    }


    static void square ( int line ){
        for ( int i = 0; i < line; i++){
            for ( int j = 0; j < line; j++){
                if ( i == 0 || i == line - 1 ) {
                    System.out.print(" * ");
                }else if ( j == 0 || j == line -1 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }
    }


    static void doubleIt ( int number ){
        number *= 2;
        System.out.println(number);
        if (number < 10_000) {
            doubleIt(number);
        }
    }

    static void tabularOutput ( int n ){
        for ( int number = 1; number <= 5; number++){
            System.out.println(number + ("\t") + n * number * 10 + ("\t") + n * number * 100 + ("\t")+ n * number *1000);
        }
    }


    static void daysOfXmas ( int day ) {
        for ( day = 1; day <= 12 ; day++){
            System.out.print("On the ");
            switch ( day ){
                case 1 :
                    System.out.print("first ");
                    break;

                case 2 :
                    System.out.print("second ");
                    break;

                case 3 :
                    System.out.print("third ");
                    break;

                case 4 :
                    System.out.print("forth ");
                    break;

                case 5 :
                    System.out.print("fifth ");
                    break;

                case 6 :
                    System.out.print("sixth ");
                    break;

                case 7 :
                    System.out.print("seventh ");
                    break;

                case 8:
                    System.out.print("eighth ");
                    break;

                case 9 :
                    System.out.print("ninth ");
                    break;

                case 10 :
                    System.out.print("tenth ");
                    break;

                case 11:
                    System.out.print("eleventh ");
                    break;

                case 12 :
                    System.out.print("twelfth ");
                    break;
            }
            System.out.println("day of Christmas, my true love gave to me : ");
            switch  ( day ){
                case 12:
                    System.out.println(" Twelve lord-a-leaping, ");
                case 11 :
                    System.out.println(" Eleven pipers piping, ");
                case 10 :
                    System.out.println(" Ten drummers drumming, ");
                case 9 :
                    System.out.println(" Nine ladies dancing, ");
                case 8 :
                    System.out.println(" Eight maids-a-milking, ");
                case 7 :
                    System.out.println(" Seven swans-a-swimming, ");
                case 6 :
                    System.out.println(" Six geese-a-laying, ");
                case 5 :
                    System.out.println(" Five golden rings.");
                case 4 :
                    System.out.println(" Four calling birds, ");
                case 3:
                    System.out.println(" three French hens, ");
                case 2 :
                    System.out.println(" Two turtle doves, and");
                case 1:
                    System.out.println(" a Patridge in pear tree.");
            }
        }
    }

    static void polindromCheck ( int number ){
       if ( number % 10 / 1 == number % 100000 / 10000 ){
           if ( number % 100 / 10 == number % 10000 / 1000)
               System.out.println("Yout number is a polindrome.");
           else
               System.out.println("Your number is not a polindrome.");
       }
       else
           System.out.println("Your number is not a polindrome.");
    }
}












