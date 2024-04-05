import Entities.BookingSystem;
import Entities.Flight;
import Entities.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addFlight(new Flight(1,"Mumbai","UAE",dateFormat.parse("10-05-2024"),100));
        bookingSystem.addFlight(new Flight(2,"Pune","Banglore",new Date(),50));
        User user1 = new User(10,"Santosh");
        bookingSystem.addUser(user1);
        bookingSystem.addUser(new User(2,"Ashutosh"));

        List<Flight> availableFlights = bookingSystem.searchFlights("Mumbai","UAE",dateFormat.parse("10-05-2024"));
        if(availableFlights.size() > 0){
            bookingSystem.makeBooking(user1,availableFlights.get(0));
        }
    }
}
