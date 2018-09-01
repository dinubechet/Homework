package com.company;

import java.util.Scanner;

public class HermosaHighSchoolStudentGradeConvert {

    public static void main(String[] args) {
    Scanner scan = new Scanner ( System.in );
        System.out.println("Please enter your name : ");
    String name = scan.nextLine();
        System.out.println("Please enter your average grade point : ");
    double averageMark = scan.nextDouble();

    pointConvertor(name,averageMark);

    }

    public static void pointConvertor ( String studentName , double studentMark ){

       double pointsConverted = studentMark * 10.0;
        System.out.println(studentName+" has earned : "+pointsConverted);
    }
}
