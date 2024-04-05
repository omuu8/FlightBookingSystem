package Entities;

public class Booking {
    private static int nextBookingId = 1;
    private int bookingId;
    private Flight flight;
    private User user;

    public Booking( Flight flight, User user) {
        this.bookingId = nextBookingId++;
        this.flight = flight;
        this.user = user;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
