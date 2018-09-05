package com.company;
//
import java.util.Scanner;

public class TestSandwich {
    private String sandwichType;
    private String breadType;
    private double price;

    public TestSandwich(String sandwichTyp, String breadType, double price) {
        this.sandwichType = sandwichTyp;
        this.breadType = breadType;
        this.price = price;

        print(sandwichTyp, breadType, price);
    }

    public TestSandwich() {
        Scanner scanner = new Scanner(System.in);
        this.sandwichType = scanner.nextLine();
        this.breadType = scanner.nextLine();
        this.price = scanner.nextDouble();
    }

    public String getSandwichType() {
        return sandwichType;
    }

    public void setSandwichType(String sandwichType) {
        this.sandwichType = sandwichType;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print(String sandwichType, String breadType, double price) {
        System.out.println(sandwichType + " " + breadType + " " + price);
    }
}
