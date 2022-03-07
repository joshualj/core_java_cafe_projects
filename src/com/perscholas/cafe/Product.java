package com.perscholas.cafe;

public abstract class Product {
    String name;
    double price;
    String description;
    int quantity;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    private Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public abstract double calculateProductTotal();
//    public double calculateProductTotal() {
//        return (quantity * price);
//    }

}

//public class Product {
//    private String name;
//    private double price;
//    private String description;
//    private int quantity;
//
//    public Product(String name, double price, String description, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.description = description;
//        this.quantity = quantity;
//    }
//
//    public Product(String name, double price, String description) {
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }
//
//    private Product() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double calculateProductTotal() {
//        return (quantity * price);
//    }
//
//}
