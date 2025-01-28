package linkedlist.singlylinkedlist.inventorymanagementsystem;
// Driver class to test the functionality of the Inventory Management System
public class InventoryDriver {
    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        // Adding items to the inventory
        inventory.addItemAtBeginning("Apple", 101, 50, 2.0);
        inventory.addItemAtEnd("Banana", 102, 30, 1.5);
        inventory.addItemAtPosition(1, "Orange", 103, 20, 3.0);

        // Displaying all items in the inventory
        System.out.println("Displaying Inventory:");
        inventory.displayInventory();

        // Searching for an item by Item ID
        System.out.println("\nSearching for Item with ID 102:");
        inventory.searchItem("102");

        // Searching for an item by Item Name
        System.out.println("\nSearching for Item with Name 'Apple':");
        inventory.searchItem("Apple");

        // Updating the quantity of an item by Item ID
        inventory.updateItemQuantity(101, 100);
        System.out.println("\nUpdated Inventory after modifying quantity of Item ID 101:");
        inventory.displayInventory();

        // Calculating and displaying the total value of the inventory
        inventory.calculateTotalInventoryValue();

        // Sorting inventory by Item Name in ascending order
        inventory.sortInventory("name", true);

        // Sorting inventory by Price in descending order
        inventory.sortInventory("price", false);

        // Removing an item by Item ID
        inventory.removeItemById(102);
        System.out.println("\nInventory after removing Item ID 102:");
        inventory.displayInventory();
    }
}
