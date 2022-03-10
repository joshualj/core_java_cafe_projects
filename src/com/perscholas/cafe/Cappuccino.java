package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product{
    boolean peppermint;
    boolean whippedCream;

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public Cappuccino() {
        super("cappuccino", 3.50, "a cap for a Capt.");
        this.peppermint = false;
        this.whippedCream = false;
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if(this.peppermint){
            price = price + 2.00;
        }
        if(this.whippedCream){
            price = price + 1.00;
        }

        return (quantity * price);
    }

    @Override
    public String printOptions() {
        if(this.peppermint && this.whippedCream) {
            return "Peppermint: Yes (+$2.00)    Whipped Cream: Yes (+$1.00)";
        } else if(this.peppermint && !this.whippedCream){
            return "Peppermint: Yes (+$2.00)    Whipped Cream: No";
        } else if(!this.peppermint && this.whippedCream) {
            return "Peppermint: No    Whipped Cream: Yes (+$1.00)";
        } else {
            return "Peppermint: No    Whipped Creeam: No";
        }
    }

    @Override
    public void addOptions(Scanner order) {
        System.out.println("Would you like to add peppermint? ");
        String peppermint = order.nextLine();
        System.out.println("Would you like to add whipped cream? ");
        String whippedCream = order.nextLine();

        if(peppermint.toUpperCase().equals("YES") || peppermint.toUpperCase().equals("Y")) {
            this.peppermint = true;
        } else {
            this.peppermint = false;
        }

        if(whippedCream.toUpperCase().equals("YES") || whippedCream.toUpperCase().equals("Y")) {
            this.whippedCream = true;
        } else {
            this.whippedCream = false;
        }
    }
}
