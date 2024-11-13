package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void generate(String sandwichDetails, double price, double totalPrice) {

        try {
            String fileCreate = fileName();
            FileWriter fileWriter = new FileWriter("src/main/resources/" + fileCreate + ".txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("The receipt information here");
            //Need the information from the additions HERE
            writer.write("Sandwich Details: " + sandwichDetails);
            writer.newLine();
            writer.write("Price: $" + price);
            writer.newLine();

            // Write total price to file
            writer.write("Total Price: $" + totalPrice);
            writer.newLine();
            writer.write("-----------------------------");
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Generating the fileName using LocalDateTime for the receipt
    public static String fileName() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);
        return formattedDate;
    }
}
