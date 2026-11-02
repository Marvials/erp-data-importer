package io.github.marvials;

import java.io.File;
import java.util.ArrayList;

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

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(product);
        products.add(product2);
        products.add(product3);

        Product productByCode = getProductByCode(products, "005");

        if (productByCode == null) {
            System.out.println("No product found with the specified code.");
            return;
        }

        System.out.println("Product found: " + productByCode);

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
