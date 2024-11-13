package com.pluralsight;

import java.util.Scanner;

public class OtherProducts {
    private String type;
    private double price;
    private int size;

    public OtherProducts() {}

    public OtherProducts(String type, double price, int size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String readDrink(Scanner scanner) {
            Scanner drink = new Scanner(System.in);
            System.out.println("What size drink?: ");
            System.out.println("4) small \n8) medium \n12) large");
            double size = drink.nextInt();

        if (size == 4) {
            price = 2.00;
        } else if (size == 8) {
            price = 2.50;
        } else if (size == 12) {
            price = 3.00;
        } else {
            System.out.println("Wrong");
        }

            System.out.println("What type of drink would you like?");
            System.out.println("Dr Pepper \nCoca Cola \nPepsi \nFanta \nLemonade \nWater \nBarqs");
            double type = drink.nextInt();

            return type + " " + size + " " + price;
    }

    public int readChips(Scanner scanner) {
            Scanner chip = new Scanner(System.in);
            System.out.println("Select the type of chips you would like: ");
            System.out.println("1) Original Lays \n2) Frito Lays \n3) Barbeque Lays \n4) Cheetos \n5) Lays Sour and Cream");
            int soMany = chip.nextInt();
            return soMany;
    }

    public double getDrinkPrice() {
        return price;
    }

    public double getChipPrice() {
        price = 1.50;
        return price;
    }
}
