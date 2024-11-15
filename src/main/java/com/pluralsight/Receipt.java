package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void generate(String orderDetails, double totalPrice) {

        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/" + fileName() + ".txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("Sandwich Details: " + orderDetails);
            writer.newLine();

            // Write total price to file
            writer.write("Total Price: $" + totalPrice);
            writer.newLine();
            writer.write("-----------------------------");
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String fileName() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);
        return formattedDate;
    }
}
