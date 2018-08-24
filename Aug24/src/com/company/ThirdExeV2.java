package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThirdExeV2 {
    static void TestScoreStatistics() {
        int max = 0;
        int min = 100;
        Scanner inputScore = new Scanner(System.in);
        //int studentScoreInput = inputScore.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();


        boolean running = true;
        while (running) {
            int qq = inputScore.nextInt();
            if (qq == 999) {
                running = false;
            }
            if (qq < 0 || qq > 100) {
                System.out.println("Please input a score between 0 and 100 : ");
                continue;
            }
            arr.add(qq);
        }
        System.out.println(arr);
        int sum = 0;
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
            sum += element;
        }
        System.out.println("Maximum score is : " + max);
        System.out.println("Minimum score is : " + min);
        float average = sum / arr.size();
        System.out.println("Average score is : " + average);

    }
}
