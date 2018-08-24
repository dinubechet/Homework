package com.company;

import java.util.Scanner;

public class LastExe {




        public static void main() {
            int score;
            Scanner scan = new Scanner(System.in);
            double sum = 0.0, smallest = 0, biggest = 0, numbers = 0;
            score = 0;



            while (score != 999)
            {
                System.out.println("Enter a test score between 0-100 or Press 999 to quit :");
                score = scan.nextInt();
                if ((score > 100 || score < 0) && score != 999)
                {
                    System.out.println("Invalid score.");
                }
                else if (score != 999)
                {
//add the score to the sum, this will be used for the average
                    sum = sum + score;
                    if (numbers == 0) //this means that no scores have been input yet
                    {
                        biggest = score;
                        smallest = score;
                    }
                    else
                    {
                        if (score > biggest) {biggest = score;}
                        if (score < smallest) {smallest = score;}
                    }
                    numbers++;
                }
            }



            if (numbers == 0)
            {
                System.out.println("No scores were inputted.");
            }
            else
            {
                System.out.println("Highest score: " + biggest);
                System.out.println("Lowest score: " + smallest);
                System.out.println("Average score: " + (sum / numbers));
            }
        }

    }
    

