package linkedlist.singlylinkedlist.inventorymanagementsystem;
// Node class representing each item in the inventory
class InventoryItemNode {
    String itemName;  // Name of the item
    int itemId;       // Unique identifier for the item
    int quantity;     // Quantity of the item
    double price;     // Price of the item
    InventoryItemNode next;  // Pointer to the next node in the list

    // Constructor to initialize an item node with given details
    public InventoryItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
