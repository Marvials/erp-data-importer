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
    }
}
