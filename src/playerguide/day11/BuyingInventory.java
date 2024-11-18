package playerguide.day11;

/*
Day 11 Challenge 1 of 2: Buying Inventory

It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner, tells you as he turns
over and attempts to go back to sleep in his reclining chair in the corner.
There’s a simple solution: use your programming powers to build something to report the prices of
various pieces of equipment, based on the user’s selection:
The following items are available:

    Rope
    Torches
    Climbing Equipment
    Clean Water
    Machete
    Canoe
    Food Supplies

What number do you want to see the price of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:
Build a program that will show the menu illustrated above.
Ask the user to enter a number from the menu.
Using the information above, use a switch (either type) to show the item’s cost.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BuyingInventory {

    static int[] itemCount = {5, 1, 3, 1, 0, 1};
    static String[] itemList = {"Rope", "Sword", "Bread", "Water", "Apple", "Mysterious Key"};
    static float[] itemPrice = {1.50f, 15f, 3f, 1f, 1f, 100f};
    static String selectedShopItem;
    static float selectedShopPrice;
    static int selectShopItemNumber;
    static float discount;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        // Make method of items with itemName(itemAvailable) + itemPrice
        // Print output to welcome to store, followed by scanner for input "Browse Shop", "Exit"
        Scanner input = new Scanner(System.in);
        System.out.println("Hi there customer! What is your name?");
        String name = input.nextLine();
        if (name.equals("Carlo")) {
            discount = 0.5f;
        } else {
            discount = 1.0f;
        }
        System.out.println("These are the items available currently in the store:");
        for (int i = 0; i < itemList.length; i++) {
            System.out.println("[" + (i + 1) + "] " + itemList[i] + " " + "-".repeat((15 - itemList[i].length())) + " available (" + itemCount[i] + ")");
        }
        System.out.println("Enter the [number] of the item above to select it");
        selectShopItemNumber = input.nextInt();

        System.out.println("The price of a " + selectionShopItem(selectShopItemNumber) + " is " + df.format(selectionShopPrice(selectShopItemNumber) * discount) + " gold.");

        // int selectedShopItemNumber = input.nextInt();
        // Print output with list of items prefixed with listNumber (-1 on array?)
        // Make shop selection
    }

    static String selectionShopItem(int selectShopItemNumber) {
        switch (selectShopItemNumber) {
            case 1:
                selectedShopItem = itemList[0];
                break;
            case 2:
                selectedShopItem = itemList[1];
                break;
            case 3:
                selectedShopItem = itemList[2];
                break;
            case 4:
                selectedShopItem = itemList[3];
                break;
            case 5:
                selectedShopItem = itemList[4];
                break;
            default:
                selectedShopItem = "Error";
        };
        return selectedShopItem;
    }

    static float selectionShopPrice(int selectShopItemNumber) {
        switch (selectShopItemNumber) {
            case 1:
                selectedShopPrice = itemPrice[0];
                break;
            case 2:
                selectedShopPrice = itemPrice[1];
                break;
            case 3:
                selectedShopPrice = itemPrice[2];
                break;
            case 4:
                selectedShopPrice = itemPrice[3];
                break;
            case 5:
                selectedShopPrice = itemPrice[4];
                break;
            default:
                selectedShopPrice = 0f;
        };
        return selectedShopPrice;
    }
}
