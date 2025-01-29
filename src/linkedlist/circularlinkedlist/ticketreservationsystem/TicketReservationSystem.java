package linkedlist.circularlinkedlist.ticketreservationsystem;

class TicketReservationSystem {
    TicketNode head; // Head node pointing to the first ticket reservation

    // Add a new ticket reservation at the end of the circular list
    public void addTicketReservation(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            // If the list is empty, initialize the circular list
            head = newTicket;
            newTicket.next = head;  // Pointing to itself to form a circular list
        } else {
            // Traverse to the last node and update the next pointer to form a circular list
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;  // The new node's next points back to the head
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicketById(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode temp = head;
        TicketNode prev = null;

        // If the head node is the one to be removed
        if (temp.ticketId == ticketId) {
            if (temp.next == head) {
                // Only one node in the list
                head = null;
            } else {
                // Move head to the next ticket
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = temp.next;
                prev.next = head;
            }
            return;
        }

        // Traverse the list to find the ticket with the given ID
        while (temp.next != head && temp.ticketId != ticketId) {
            prev = temp;
            temp = temp.next;
        }

        if (temp.ticketId == ticketId) {
            prev.next = temp.next;  // Remove the ticket by adjusting pointers
        } else {
            System.out.println("Ticket with ID " + ticketId + " not found.");
        }
    }

    // Display all tickets in the reservation list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                    ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head); // Loop back when we reach the head
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                // If the query matches Customer Name or Movie Name
                System.out.println("Ticket Found: Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                        ", Booking Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head); // Loop back to check the entire list

        System.out.println("Ticket not found.");
    }

    // Calculate and display the total number of booked tickets
    public int countTotalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head); // Loop back to count all tickets

        return count;
    }
}
