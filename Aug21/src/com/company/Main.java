package com.company;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


      //  factorialNumbers();
        //sale();
    }
    static void factorialNumbers (){

        long product ;
        long counter = 1L;
        for ( long i = 1L; i < 20; i++ ){
            product = counter;
            product *= i;
            counter = product;
            System.out.println(counter+"  ");

        }
    }

    static void sale (){
        Scanner input = new Scanner(System.in) ;
        double product1 ;
        double product2 ;
        double product3 ;
        double product4 ;
        double product5 ;
        double value = 1;
        int counter = 1;
        System.out.println("Input how many of each product you sold: ");
         product1 = input.nextDouble();
         product2 = input.nextDouble();
         product3 = input.nextDouble();
         product4 = input.nextDouble();
         product5 = input.nextDouble();

         for(;counter <= 5;counter++){
             switch(counter) {
                 case 1: value = product1*2.98; break;
                 case 2: value = value + product2*4.50; break;
                 case 3: value = value + product3*9.98; break;
                 case 4: value = value + product4*4.49; break;
                 case 5: value = value + product5*6.87; break;
             }
         }System.out.printf("The total retail value of all products is: %.2f $",value);
    }

}
