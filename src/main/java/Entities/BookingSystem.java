package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingSystem {
    List<User> users;
    List<Flight> flights;
    List<Booking> bookings;

    public BookingSystem() {
        this.users = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addFlight(Flight newFlight){
        flights.add(newFlight);
    }

    public void addUser(User newUser){
        users.add(newUser);
    }
    public void makeBooking(User user,Flight flight){
        if(flight.getAvailableSeats() > 0){
            Booking booking = new Booking(flight,user);
            bookings.add(booking);
            flight.setAvailableSeats(flight.getAvailableSeats()-1);
            System.out.println("Booking has been successful "+"with BookingID "+booking.getBookingId());
        }else{
            System.out.println("Booking Failed - No available Seats");
        }
    }
    public List<Flight> searchFlights(String source, String destination, Date date){
        List<Flight> result = new ArrayList<>();

        for(Flight f : flights){
            if(f.getDate().equals(date) && f.getSource().equalsIgnoreCase(source) && f.getDestination().equalsIgnoreCase(destination)){
                result.add(f);
            }
        }
        return result;
    }
}
