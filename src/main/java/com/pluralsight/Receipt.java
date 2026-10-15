package com.pluralsight;

public class Receipt { public static void main(String[] args) {
    // 1. Create variables for an item name (String) and item price (double)
    String itemName = "apples";
    double itemPrice = 2.37;
    // 2. Create a quantity variable (int)
    int quantity = 3;
    // Calculate total cost for accuracy
    double totalCost = itemPrice * quantity;

    // 3. Build and print output
    System.out.println("You bought " + quantity + " " + itemName + " " + "for $" + totalCost);

}

}


