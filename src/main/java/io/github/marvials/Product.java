package io.github.marvials;

public class Product {
    private String code;
    private String description;
    private double price;
    private int quantity;

    public Product (String code, String description, double price, int quantity) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
}
