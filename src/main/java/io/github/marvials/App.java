package io.github.marvials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("The CSV file path is required.");
            return;
        }

        File CSVFile = new File(args[0]);

        if(!CSVFile.exists()) {
            System.out.println("The CSV file provided does not exist!");
            return;
        }

        System.out.println("The CSV File exists.");

        ArrayList<Product> products = new ArrayList<Product>();

        try (LineNumberReader reader = new LineNumberReader(new FileReader(CSVFile))) {
            System.out.println("CSV file opened successfully.");

            String line;
            
            while ((line = reader.readLine()) != null) {
                if(reader.getLineNumber() == 1) {
                    continue;
                }


                String[] fields = line.split(";");

                Product product = new Product(fields[0], fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]));

                System.out.println(product);
            }

        } catch (IOException e) {
            System.err.println("An error occurred while opening the CSV file.");
            e.printStackTrace();
        }

    }

    public static Product getProductByCode(ArrayList<Product> products, String code) {
        Product product = null;

        for(int i = 0; i < products.size(); i++) {
            if(code == products.get(i).getCode()) {
                product = products.get(i);
                break;
            }
        }

        return product;
    }
}
