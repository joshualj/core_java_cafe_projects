package com.perscholas.cafe;

public class Espresso extends Product{
    boolean extraShot;
    boolean macchiato;

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = extraShot;
    }

    public Espresso() {
        super("Espresso", 4.00, "a nice caffeine kick");
        this.extraShot = false;
        this.macchiato = false;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }


    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if(this.macchiato){
            price = price + 2.00;
        }
        if(this.extraShot){
            price = price + 1.00;
        }

        return (quantity * price);
    }
}
