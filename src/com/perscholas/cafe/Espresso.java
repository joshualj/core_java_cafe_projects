package com.perscholas.cafe;

import java.util.Scanner;

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

    @Override
    public String printOptions() {
        if(this.macchiato && this.extraShot) {
            return "Macchiato: Yes (+$2.00)    Extra Shot: Yes (+$1.00)";
        } else if(this.macchiato && !this.extraShot){
            return "Macchiato: Yes (+$2.00)    Extra Shot: No";
        } else if(!this.macchiato && this.extraShot) {
            return "Macchiato: No    Extra Shot: Yes (+$1.00)";
        } else {
            return "Macchiato: No    Extra Shot: No";
        }
    }

    @Override
    public void addOptions(Scanner order) {
        System.out.println("Would you like to add an extra shot? ");
        String extraShot = order.nextLine();
        System.out.println("Would you like to add machiatto? ");
        String machiatto = order.nextLine();

        if(extraShot.toUpperCase().equals("YES") || extraShot.toUpperCase().equals("Y")) {
            this.extraShot = true;
        } else {
            this.extraShot = false;
        }

        if(machiatto.toUpperCase().equals("YES") || machiatto.toUpperCase().equals("Y")) {
            this.macchiato = true;
        } else {
            this.macchiato = false;
        }
    }
}
