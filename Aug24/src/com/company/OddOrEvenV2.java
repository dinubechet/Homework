package com.company;

import java.util.Scanner;

public class OddOrEvenV2 {
    static void OddOrEven () {
        System.out.println("Imput an odd number : ");
        Scanner imputNumber = new Scanner(System.in);
        int imput = imputNumber.nextInt();
        for (;imput != 999;){
            if (imput % 2 == 0) {
                System.out.println("Good job!");

                imput = imputNumber.nextInt();


            } else {
                System.out.println("This is not an even number! Try again");

                imput = imputNumber.nextInt();
            }
        }
    }
}
