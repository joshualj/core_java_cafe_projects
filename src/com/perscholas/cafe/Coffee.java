package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product{
    boolean sugar;
    boolean milk;

    //constructor which accepts five attributes
    public Coffee(String name, double price, String description, boolean sugar, boolean milk){
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    //no-arg constructor
    public Coffee() {
        super("Coffee", 5.00, "regular coffee");
        this.sugar = false;
        this.milk = false;
    }

    //Getters and setters

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();
        return (quantity * price);
    }

    @Override
    public String printOptions() {
        if(this.sugar && this.milk) {
            return "Sugar: Yes (+$2.00)    Milk: Yes (+$1.00)";
        } else if(this.sugar && !this.milk){
            return "Sugar: Yes (+$2.00)    Milk: No";
        } else if(!this.sugar && this.milk) {
            return "Sugar: No    Milk: Yes (+$1.00)";
        } else {
            return "Sugar: No    Milk: No";
        }
    }

    @Override
    public void addOptions(Scanner order) {
        System.out.println("Would you like to add milk? ");
        String milk = order.nextLine();
        System.out.println("Would you like to add sugar? ");
        String sugar = order.nextLine();

        if(milk.toUpperCase().equals("YES") || milk.toUpperCase().equals("Y")) {
            this.milk = true;
        } else {
            this.milk = false;
        }

        if(sugar.toUpperCase().equals("YES") || sugar.toUpperCase().equals("Y")) {
            this.sugar = true;
        } else {
            this.sugar = false;
        }
    }
}
