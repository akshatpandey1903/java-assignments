package com.aurionpro.model;

import java.io.*;

public class Product implements Serializable {
    private static final String ID_FILE = "D:\\vscode\\javaAssignments\\Week6\\InventoryManagement\\unique_ids.txt";
    private static int idCounter = loadLastId("product"); // Load last used product ID
    private final int productId;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Product(String name, String description, int quantity, double price) {
        this.productId = idCounter++;
        saveLastId("product", idCounter); // Save updated product ID
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

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

    private static void saveLastId(String type, int id) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ID_FILE))) {
            writer.write(type + "=" + id + "\n"); // Store each type's ID
        } catch (IOException e) {
            System.err.println("Error saving " + type + " ID: " + e.getMessage());
        }
    }

    private static int loadLastId(String type) {
        File file = new File(ID_FILE);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("="); // Parse key=value format
                    if (parts[0].equals(type)) {
                        return Integer.parseInt(parts[1]);
                    }
                }
            } catch (IOException | NumberFormatException e) {
                System.err.println("Error loading " + type + " ID, resetting to default.");
            }
        }
        return getDefaultId(type);
    }

    private static int getDefaultId(String type) {
        return switch (type) {
            case "product" -> 1000;
            case "supplier" -> 5000;
            case "transaction" -> 8000;
            default -> 1;
        };
    }
}
