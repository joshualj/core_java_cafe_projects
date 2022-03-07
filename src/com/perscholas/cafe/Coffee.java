package com.perscholas.cafe;

public class Coffee extends Product{
    boolean sugar;
    boolean milk;

    //no-arg constructor

    public Coffee(String name, double price, String description, boolean sugar, boolean milk){
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    //constructor which accepts five attributes

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
}
