package com.pluralsight;

import java.util.Scanner;

public class Sandwich {
    private int size;
    private double price;
    private String bread, meat, cheese, toasted;

    public Sandwich() { }

    public Sandwich(int size, double price, String bread, String meat, String cheese, String toasted) {
        this.size = size;
        this.price = price;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toasted = toasted;
    }

    public String readSandwich(Scanner scanner) {

            System.out.println("Select your bread choice: \n");
            System.out.println("Wheat, white, rye, wrap");
            scanner.nextLine();
            String bread = scanner.nextLine();

            System.out.println("Select your sandwich size in inches: \n");
            System.out.println("4, 8, or 12");
            int size = scanner.nextInt();

            System.out.println("Now for the Toppings: \n");

            System.out.println("Select your meat choice: steak, ham, salami, roast beef, chicken, bacon");
            scanner.nextLine();
            String meat = scanner.nextLine();

            System.out.println("Select your cheese: american, provolone, cheddar, swiss");
            String cheese = scanner.nextLine();

            System.out.println("Would you like extra meat or cheese? (YES/NO)");
            String option = scanner.nextLine();

        this.setBread(bread);
        this.setSize(size);
        this.setMeat(meat);
        this.setCheese(cheese);

            if (option.equalsIgnoreCase("yes")) {
                price = getPrice() + getExtra();
            } else {
                price = getPrice();
            }

            System.out.println("Would you like your bread toasted?");
            String toast = scanner.nextLine();

            if (toast.equalsIgnoreCase("yes")) {
                toasted = "(toasted)";
            } else {
                toasted = "()";
            }

            System.out.println("Here is your sandwich!");
            System.out.println(size + "\" " + bread + " bread " + toasted + meat + " sandwich with " + cheese + " cheese, " + price + "\n");
            return size + bread + meat + cheese + toasted + price;
    }
    public double getExtra() {

            Scanner some = new Scanner(System.in);
            System.out.println("How much extra meat would you like?");
            int extraMeat = some.nextInt();

            System.out.println("How much extra cheese would you like?");
            int extraCheese = some.nextInt();

            double upMeat = 0.0;
            if (size == 4) {
                upMeat = .50;
            } else if (size == 8) {
                upMeat = 1.00;
            } else if (size == 12) {
                upMeat = 1.50;
            } else {
                upMeat = 0.0;
            }

            double upCheese = 0.0;
            if (size == 4) {
                upCheese = .30;
            } else if (size == 8) {
                upCheese = .60;
            } else if (size == 12) {
                upCheese = .90;
            } else {
                upCheese = 0.0;
            }

            double extra = (extraMeat * upMeat) + (extraCheese * upCheese);
            return extra;
    }

    public double getPrice() {
       if (size == 4) {
           price = 7.25;
       } else if (size == 8) {
           price = 10.50;
       } else if (size == 12) {
           price = 13.75;
       } else {
           price = 0;
       }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public String getToasted() {
        return toasted;
    }

    public void setToasted(String toasted) {
        this.toasted = toasted;
    }
}
