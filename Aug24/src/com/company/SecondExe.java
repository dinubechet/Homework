package com.company;

import java.util.Scanner;

public class SecondExe {
    static void everyIntegerBetweenTheTwoInserted (){
        System.out.println("Imput two integers : ");
        Scanner imputInteger = new Scanner ( System.in );
        int userImput1 = imputInteger.nextInt();
        int userImput2 = imputInteger.nextInt();
        for ( ;userImput1 +1 <= userImput2;  userImput1 ++){
            System.out.println(userImput1);
        }
        for (; userImput2 +1 <= userImput1 ; userImput2 ++){
            System.out.println(userImput2);
        }
    }
}
