package Entities;

import java.util.Date;

public class Flight {
    private int flightNo;
    private String source;
    private String destination;
    private Date date;
    private int availableSeats;

    public Flight(int flightNo, String source, String destination, Date date, int availableSeats) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.availableSeats = availableSeats;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
