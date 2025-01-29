package linkedlist.circularlinkedlist.ticketreservationsystem;

// Node class representing a booked ticket
class TicketNode {
    int ticketId;        // Ticket ID
    String customerName; // Customer's name
    String movieName;    // Movie name
    String seatNumber;   // Seat number
    String bookingTime;  // Booking time
    TicketNode next;     // Pointer to the next node in the circular linked list

    // Constructor to initialize a ticket node
    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
