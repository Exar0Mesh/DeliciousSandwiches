package com.pluralsight;

import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;
        //HomeScreen

        while (running) {

        System.out.println("Welcome to Delicious Sandwiches!");
        System.out.print("Type in which option you would prefer below: \n1) New Order \n0) Exit \n");
        int home = scanner.nextInt();

        if (home == 0) {
            System.exit(0);
            }

        if (home == 1) {
            while (true) {

            System.out.println("Time for Deli picking. What would you like to order?");
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
                        double sandwichPrice = sandwich.getPrice();
                        int i = 0;
                        i++;
                        totalPrice += sandwichPrice * i;
                        System.out.println("Sandwich added to order. Price: $" + sandwichPrice);
                        break;
                    case 2:
                        System.out.println("Add Drink");
                        OtherProducts drink = new OtherProducts();
                        System.out.println(drink.readDrink(scanner));
                        break;
                    case 3:
                        System.out.println("Add Chips");
                        OtherProducts chips = new OtherProducts();
                        System.out.println(chips.readChips(scanner));
                        break;
                    case 4:
                        System.out.println("Checkout");
                        checkout(totalPrice);
                        break;
                    case 0:
                        //loop out
                        System.out.println("Cancelling order\n");
                        totalPrice = 0;
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        break;
                }
                }
            }
        }
    }

    //This is only for one sandwich at a time, but will be added to total
    //Each option will cost something
    //Price could be a key for a hashmap

    public static void checkout(double totalPrice) {
        //Should include the other methods, their price, and the such
        //Should include all the options that require payment, including meats, extra items, and such. Drinks and chips
        Scanner check = new Scanner(System.in);
        System.out.println("1) Confirm \n2) Cancel");
        int checkout = check.nextInt();

        if (checkout == 1) {
            System.out.println("Generating your receipt...");
            Receipt.generate("Total order price: $" + totalPrice, totalPrice, totalPrice);
            //The receipt must be generated from a localDateTime, so the name will be formatted for it
        }
        if (checkout == 2) {
            System.out.println("Going home again");
        }
        //Buffered Writer yippee
    }
}
