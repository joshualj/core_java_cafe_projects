package com.perscholas.cafe;

import com.perscholas.cafe.Product;

import java.util.Scanner;

public class CafeApp {


    public static void main(String[] args) {
        Product coffee = new Coffee();
        Product espresso = new Espresso("espresso", 4.00, "nice caffeine kick", true, true);
        Product cappuccino = new Cappuccino();

        Scanner productQuant = new Scanner(System.in);

        System.out.println("Please enter quantities for coffee, espresso, and cappuccino, separated by spaces (example:1 1 1):\n ");
        String[] productQuants = productQuant.nextLine().split(" ");

        int coffeeQuant = Integer.parseInt(productQuants[0]);
        int espressoQuant = Integer.parseInt(productQuants[1]);
        int cappuccinoQuant = Integer.parseInt(productQuants[2]);

        coffee.setQuantity(coffeeQuant);
        espresso.setQuantity(espressoQuant);
        cappuccino.setQuantity(cappuccinoQuant);

        double coffeeSubtotal = coffee.calculateProductTotal();
        double espressoSubtotal = espresso.calculateProductTotal();
        double cappuccinoSubtotal = cappuccino.calculateProductTotal();

        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", coffee.getName(), coffee.getDescription(), coffeeSubtotal);
        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", espresso.getName(), espresso.getDescription(), espressoSubtotal);
        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", cappuccino.getName(), cappuccino.getDescription(), cappuccinoSubtotal);

        double salesTax = 0.6875;
        double subTotal = cappuccinoSubtotal + espressoSubtotal + coffeeSubtotal;
        double salesTotal = subTotal + (salesTax * subTotal);
        System.out.printf("Sales subtotal: %.2f\nSales Tax: %.2f\nSales Total: %.2f", subTotal, salesTax, salesTotal);
    }

}

//project one is below
//    public static void main(String[] args) {
//        Product coffee = new Product("coffee", 5.00, "regular coffee");
//        Product espresso = new Product("espresso", 4.00, "nice caffeine kick");
//        Product cappuccino = new Product("cappuccino", 3.50, "a cap for a captain");
//
//        Scanner productQuant = new Scanner(System.in);
//
//        System.out.println("Please enter a quantity of coffees, espressos, and cappuccinos in the format 1 1 1: ");
//        String[] productQuants = productQuant.nextLine().split(" ");
//
//        int coffeeQuant = Integer.parseInt(productQuants[0]);
//        int espressoQuant = Integer.parseInt(productQuants[1]);
//        int cappuccinoQuant = Integer.parseInt(productQuants[2]);
//
//        coffee.setQuantity(coffeeQuant);
//        espresso.setQuantity(espressoQuant);
//        cappuccino.setQuantity(cappuccinoQuant);
//
//        double coffeeSubtotal = coffee.calculateProductTotal();
//        double espressoSubtotal = espresso.calculateProductTotal();
//        double cappuccinoSubtotal = cappuccino.calculateProductTotal();
//
//        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", coffee.getName(), coffee.getDescription(), coffeeSubtotal);
//        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", espresso.getName(), espresso.getDescription(), espressoSubtotal);
//        System.out.printf("The subtotal of your %s, with description of '%s', is: %.2f\n", cappuccino.getName(), cappuccino.getDescription(), cappuccinoSubtotal);
//
//        double salesTax = 0.6875;
//        double subTotal = cappuccinoSubtotal + espressoSubtotal + coffeeSubtotal;
//        double salesTotal = subTotal + (salesTax * subTotal);
//        System.out.printf("Sales subtotal: %.2f\nSales Tax: %.2f\nSales Total: %.2f", subTotal, salesTax, salesTotal);
//    }
//}
