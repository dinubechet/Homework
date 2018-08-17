package com.company;

public class OddNumberProduct {

    public static void main(String[] args) {


                {
                    int total = 1; // If it will start from zero,the first iteration will be 0 x 3 which is equal to 0 and zero is not an odd number

                    for (int i = 3; i <= 15; i += 2) // Started int i from 3 because total is already 1, and there is no point to have the 1 x 1 iteration.
                    {

                        total = total * i;

                    }
                    System.out.println("The sum of the odd integers is:" + total);
                }



            }
        }


