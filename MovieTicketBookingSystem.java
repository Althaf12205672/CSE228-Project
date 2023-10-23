import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("1. Book Tickets");
        System.out.println("2. Exit");
        System.out.print("Please enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                bookTickets(scanner);
                break;
            case 2:
                System.out.println("Thank you for using our system. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        scanner.close();
    }

    private static void bookTickets(Scanner scanner) {
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter the number of tickets to book: ");
        int numberOfTickets = scanner.nextInt();

        String bookingID = generateBookingID();
        System.out.println("Booking successful!");
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Booking ID: " + bookingID);
    }

    private static String generateBookingID() {
        return "BK123456";
    }
}

