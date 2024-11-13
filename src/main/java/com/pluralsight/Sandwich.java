package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sandwich {
    private int size;
    private double price;
    private String bread, meat, cheese;

    public Sandwich() { }

    public Sandwich(int size, double price, String bread, String meat, String cheese) {
        this.size = size;
        this.price = price;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
    }

    public String readSandwich(Scanner scanner) {

            System.out.println("Select your bread choice: ");
            System.out.println("Wheat bread, oat bread, almond bread, 2% bread...wait this list is milk");
            String bread = scanner.nextLine();
            //This could easily be the bread choice

            System.out.println("Select your sandwich size: ");
            System.out.println("4\", 8\", or 12\"");
            String size = scanner.nextLine();
            //small, medium, large will yield various prices

            System.out.println("Toppings: ");
            System.out.println("Select your meat choice: steak, ham, salami, roast beef, chicken, bacon");
            String meat = scanner.nextLine();

            System.out.println("Select your cheese: american, provolone, cheddar, swiss");
            String cheese = scanner.nextLine();

            System.out.println("Would you like extra meat or cheese?");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("yes")) {
                System.out.println("Which would you like extra of?: ");
                System.out.println("1) Meat \n2) Cheese \n3) both!");
                int extra = scanner.nextInt();
            }

            this.getPrice();

            System.out.println("Here is your sandwich!");
            return size + " " + bread + " bread " + meat + " sandwich with " + cheese + " " + this.getPrice();
            //Size can determine the prices. N/A can be an option for no price on it?
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        ArrayList<Double> small = new ArrayList<>();
        small.add(5.50);
        small.add(1.00);
        small.add(0.50);
        small.add(0.75);
        small.add(0.30);

        ArrayList<Double> medium = new ArrayList<>();
        medium.add(7.00);
        medium.add(2.00);
        medium.add(1.00);
        medium.add(1.50);
        medium.add(0.60);

        ArrayList<Double> large = new ArrayList<>();
        large.add(8.50);
        large.add(3.00);
        large.add(1.50);
        large.add(2.25);
        large.add(0.90);

        HashMap<Integer, ArrayList<Double>> sandwich = new HashMap<>();
        sandwich.put(4, small);
        sandwich.put(8, medium);
        sandwich.put(12, large);

        ArrayList<Double> retrieve = sandwich.get(size);
        if ((retrieve != null && !retrieve.isEmpty())) {
            price = retrieve.get(0);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
}
