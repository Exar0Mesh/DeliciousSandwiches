package com.pluralsight;

import java.util.Scanner;

public class OtherProducts {
    private double price;
    private int size;
    private String drink;
    private String chips;

    public OtherProducts() {}

    public String readDrink(Scanner scanner) {
            Scanner drink = new Scanner(System.in);
            System.out.println("What size drink?: ");
            System.out.println("4) small \n8) medium \n12) large");
            int size = drink.nextInt();
            this.setSize(size);

            System.out.println("What type of drink would you like?");
            System.out.println("Dr Pepper \nCoca Cola \nPepsi \nFanta \nLemonade \nWater \nBarqs");
            scanner.nextLine();
            String type = drink.nextLine();
            this.setDrink(type);

            return type + " " + size + " " + this.getDrinkPrice();
    }

    public String readChips(Scanner scanner) {
            System.out.println("Select the type of chips you would like: ");
            System.out.println("Original Lays, Frito Lays, Barbeque Lays, Cheetos, Lays Sour and Cream");
            scanner.nextLine();
            String soMany = scanner.nextLine();
            this.setChips(soMany);
            return soMany;
    }

    public double getDrinkPrice() {
        if (size == 4) {
            price = 2.00;
        } else if (size == 8) {
            price = 2.50;
        } else if (size == 12) {
            price = 3.00;
        } else {
            price = 0;
        }
        return price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getChipPrice() {
        price = 1.50;
        return price;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public OtherProducts(int size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
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
}
