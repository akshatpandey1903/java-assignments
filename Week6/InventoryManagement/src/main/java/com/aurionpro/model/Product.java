package com.aurionpro.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static int idCounter = 1000; // Auto-incrementing ID
    private final int productId;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Product(String name, String description, int quantity, double price) {
        this.productId = idCounter++;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addStock(int amount) {
        this.quantity += amount;
    }

    public boolean removeStock(int amount) {
        if (amount > quantity) {
            return false; // Not enough stock
        }
        this.quantity -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + name + ", Description: " + description +
                ", Quantity: " + quantity + ", Price: " + price;
    }
}

