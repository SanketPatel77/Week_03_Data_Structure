package linkedlist.singlylinkedlist.inventorymanagementsystem;
import java.util.*;  // Importing utility classes for sorting

// Singly Linked List class to manage inventory items
class InventoryManagementSystem {
    InventoryItemNode head;  // Head node pointing to the first item in the list

    // Add an item at the beginning of the inventory list
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        InventoryItemNode newItem = new InventoryItemNode(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end of the inventory list
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryItemNode newItem = new InventoryItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            InventoryItemNode temp = head;
            while (temp.next != null) {
                temp = temp.next;  // Traverse to the last item in the list
            }
            temp.next = newItem;  // Add the new item at the end
        }
    }

    // Add an item at a specific position in the inventory list
    public void addItemAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        InventoryItemNode newItem = new InventoryItemNode(itemName, itemId, quantity, price);
        if (position == 0) {
            addItemAtBeginning(itemName, itemId, quantity, price);  // Special case for adding at the beginning
        } else {
            InventoryItemNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp.next == null) return;  // Prevent out-of-bound access
                temp = temp.next;
            }
            newItem.next = temp.next;  // Link the new item to the next item
            temp.next = newItem;       // Link the previous item to the new item
        }
    }

    // Remove an item by its Item ID from the inventory list
    public void removeItemById(int itemId) {
        if (head == null) return;  // If the list is empty, do nothing

        if (head.itemId == itemId) {
            head = head.next;  // If the item to be removed is the head, move the head to the next item
            return;
        }

        InventoryItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;  // Traverse the list to find the item with the given ID
        }

        if (temp.next != null) {
            temp.next = temp.next.next;  // Skip the item to be removed
        }
    }

    // Update the quantity of an item by its Item ID
    public void updateItemQuantity(int itemId, int newQuantity) {
        InventoryItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;  // Update the quantity
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    // Search for an item by Item ID or Item Name
    // Search for an item by Item ID or Item Name
    public void searchItem(String query) {
        try {
            int itemId = Integer.parseInt(query);  // Try to parse the input as Item ID
            InventoryItemNode temp = head;
            while (temp != null) {
                if (temp.itemId == itemId) {
                    // If the query matches Item ID
                    System.out.println("Item Found: ID: " + temp.itemId + ", Name: " + temp.itemName +
                            ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Item with ID " + itemId + " not found.");
        } catch (NumberFormatException e) {
            // If the query cannot be parsed as an integer, treat it as Item Name
            InventoryItemNode temp = head;
            while (temp != null) {
                if (temp.itemName.equalsIgnoreCase(query)) {
                    // If the query matches Item Name
                    System.out.println("Item Found: ID: " + temp.itemId + ", Name: " + temp.itemName +
                            ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Item with Name " + query + " not found.");
        }
    }


    // Calculate and display the total value of the inventory (Sum of Price * Quantity for each item)
    public void calculateTotalInventoryValue() {
        double totalValue = 0;
        InventoryItemNode temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;  // Price * Quantity for each item
            temp = temp.next;
        }
        System.out.println("Total value of the inventory: " + totalValue);
    }

    // Sort the inventory based on Item Name or Price in ascending or descending order
    public void sortInventory(String sortBy, boolean ascending) {
        if (head == null) {
            System.out.println("No items available.");
            return;
        }

        List<InventoryItemNode> itemList = new ArrayList<>();
        InventoryItemNode temp = head;
        while (temp != null) {
            itemList.add(temp);  // Add each item node to a list
            temp = temp.next;
        }

        if (sortBy.equalsIgnoreCase("name")) {
            // Sort by Item Name
            itemList.sort((item1, item2) -> ascending ? item1.itemName.compareTo(item2.itemName) :
                    item2.itemName.compareTo(item1.itemName));
        } else if (sortBy.equalsIgnoreCase("price")) {
            // Sort by Price
            itemList.sort((item1, item2) -> ascending ? Double.compare(item1.price, item2.price) :
                    Double.compare(item2.price, item1.price));
        }

        // Display the sorted items
        System.out.println("Sorted Inventory:");
        for (InventoryItemNode item : itemList) {
            System.out.println("ID: " + item.itemId + ", Name: " + item.itemName + ", Quantity: " + item.quantity +
                    ", Price: " + item.price);
        }
    }

    // Display all items in the inventory list
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        InventoryItemNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName + ", Quantity: " + temp.quantity +
                    ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
