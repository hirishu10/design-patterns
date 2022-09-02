package IteratorPattern;

import IteratorPattern.Concreate.ItemInventory;
import IteratorPattern.Interface.InventoryIterator;

public class IteratorExample {

    public static void main(String[] args) {
        ItemInventory<String> itemInventory = new ItemInventory<>();
        itemInventory.addNewItem("Books");
        itemInventory.addNewItem("Pens");
        itemInventory.addNewItem("Cube");
        itemInventory.addNewItem("Laptop");
        itemInventory.addNewItem("Mobile");


        InventoryIterator item = itemInventory.getIterator();// Return all the item inside the InventoryIterator;
        while (item.hasNext()){ // Checks if any next FoodItem is available
            System.out.println("FoodItem: " + item.currentItem()); // Print the item
            item.next();// Not forget to increment the item otherwise it will go in infinity "We can also make this to put inside the currentItem to run auto"
        }

        System.out.println();
        System.out.println();

        ItemInventory<Integer> numberInventory = new ItemInventory<>();
        numberInventory.addNewItem(10);
        numberInventory.addNewItem(20);
        numberInventory.addNewItem(30);
        numberInventory.addNewItem(40);
        numberInventory.addNewItem(50);


        InventoryIterator numberItem = numberInventory.getIterator();// Return all the item inside the InventoryIterator;
        while (numberItem.hasNext()){ // Checks if any next FoodItem is available
            System.out.println("Number: " + numberItem.currentItem()); // Print the item
            numberItem.next();// Not forget to increment the item otherwise it will go in infinity "We can also make this to put inside the currentItem to run auto"
        }
    }
}
