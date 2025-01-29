package linkedlist.circularlinkedlist.ticketreservationsystem;

public class TicketReservationDriver {
    public static void main(String[] args) {
        TicketReservationSystem ticketSystem = new TicketReservationSystem();

        // Adding some ticket reservations
        ticketSystem.addTicketReservation(1, "sanket", "Avengers", "A1", "2025-01-29 14:00");
        ticketSystem.addTicketReservation(2, "Jatin", "Spider-Man", "B3", "2025-01-29 16:00");
        ticketSystem.addTicketReservation(3, "sandeep", "Batman", "C5", "2025-01-29 18:00");

        // Display all booked tickets
        System.out.println("All booked tickets:");
        ticketSystem.displayTickets();

        // Search for a ticket by Customer Name
        System.out.println("\nSearching for tickets by Customer Name 'John Doe':");
        ticketSystem.searchTicket("John Doe");

        // Search for a ticket by Movie Name
        System.out.println("\nSearching for tickets by Movie Name 'Spider-Man':");
        ticketSystem.searchTicket("Spider-Man");

        // Remove a ticket by Ticket ID
        System.out.println("\nRemoving ticket with ID 2:");
        ticketSystem.removeTicketById(2);

        // Display all tickets after removal
        System.out.println("\nAll booked tickets after removal:");
        ticketSystem.displayTickets();

        // Count total booked tickets
        int totalTickets = ticketSystem.countTotalTickets();
        System.out.println("\nTotal number of booked tickets: " + totalTickets);
    }
}
