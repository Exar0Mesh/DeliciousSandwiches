package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        List<String> fixings = new ArrayList<>();
        double totalPrice = 0.0;

    while (running) {
            System.out.println("Welcome to Delicious Sandwiches! \n");
            System.out.print("Type in which option you would prefer below: \n1) New Order \n0) Exit \n");
            int home = scanner.nextInt();

        if (home == 0) {
            System.exit(0);
            }

        if (home == 1) {
            while (home != 0) {
            System.out.println("Time for Deli picking! What would you like to order?");

            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int order = scanner.nextInt();


                switch (order) {
                    case 1:
                        System.out.println("Add Sandwich");
                        Sandwich sandwich = new Sandwich();
                        sandwich.readSandwich(scanner);
                        double sandwichPrice = (sandwich.getPrice());
                        totalPrice += sandwichPrice;
                        fixings.add("Sandwich: " + sandwich.getBread() + sandwich.getToasted() + ", " + sandwich.getMeat() + ", "
                                + sandwich.getSize() + "\", - $" + sandwich.getPrice());
                        break;
                    case 2:
                        System.out.println("Drinks! \n");
                        OtherProducts drink = new OtherProducts();
                        drink.readDrink(scanner);
                        double drinkPrice = drink.getDrinkPrice();
                        totalPrice += drinkPrice;
                        fixings.add("Drink: " + drink.getDrink() + " - $" + drinkPrice);
                        break;
                    case 3:
                        System.out.println("Chips! \n");
                        OtherProducts chips = new OtherProducts();
                        chips.readChips(scanner);
                        double chipsPrice = chips.getChipPrice();
                        totalPrice += chipsPrice;
                        fixings.add("Chips: " + chips.getChips() + " - $" + chipsPrice);
                        break;
                    case 4:
                        System.out.println("Checkout");
                        checkout(fixings, totalPrice);
                        break;
                    case 0:
                        System.out.println("Cancelling order\n");
                        totalPrice = 0;
                        home = 0;
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        break;
                    }
                }
            }
        }
    }

    public static void checkout(List<String> fixings, double totalPrice) {
        Scanner check = new Scanner(System.in);

        System.out.println("1) Confirm \n2) Cancel");
        int checkout = check.nextInt();

        if (checkout == 1) {
            System.out.println("Generating your receipt...");
            for (String item : fixings) {
                System.out.println(item);
            }
            Receipt.generate(String.valueOf(fixings), totalPrice);
        }
        if (checkout == 2) {
            System.out.println("Miss-click?");
        }
    }

}
