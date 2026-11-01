package io.github.marvials;

import java.io.File;

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

        Product product = new Product("001", "Mouse", 100.00, 1);
        Product product2 = new Product("002", "Keyboard", 150.00, 2);
        Product product3 = new Product("003", "TV", 200.00, 3);

        System.out.println(product);
        System.out.println(product2);
        System.out.println(product3);
    }
}
