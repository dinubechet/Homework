package com.company;

public class Sandwich {

    public static void main(String[] args) {

        TestSandwich sandwich2 = new TestSandwich("Tuna", "Wheat", 3.5);

        TestSandwich sandwich = new TestSandwich();
//        sandwich.setSandwichType("Tuna");
//        sandwich.setBreadType("Wheat");
//        sandwich.setPrice(2.5);
        sandwich.print(sandwich.getSandwichType(), sandwich.getBreadType(), sandwich.getPrice());

    }
}
