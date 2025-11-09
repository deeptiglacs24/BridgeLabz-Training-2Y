package exception;
import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

public class MovieTicketBooking {
    private static Map<Integer, Boolean> seats = new HashMap<>();

    static {
        for (int i = 1; i <= 10; i++) {
            seats.put(i, false); // All seats initially available
        }
    }

    public static void bookSeat(int seatNumber)
            throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Seat number " + seatNumber + " does not exist!");
        }
        if (seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat number " + seatNumber + " is already booked!");
        }

        seats.put(seatNumber, true);
        System.out.println("Seat " + seatNumber + " booked successfully!");
    }

    public static void main(String[] args) {
        System.out.println("=== Movie Ticket Booking System ===");
        try {
            bookSeat(3);
            bookSeat(3); // Already booked
        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
