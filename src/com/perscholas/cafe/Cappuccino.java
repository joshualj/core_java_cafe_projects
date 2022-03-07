package com.perscholas.cafe;

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
}
