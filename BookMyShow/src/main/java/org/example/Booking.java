package org.example;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    int bookingId;
    Show show;
    User user;

    public Booking(int bookingId, Show show, User user) {
        this.bookingId = bookingId;
        this.show = show;
        this.user = user;
    }

    List<Booking> bookingList=new ArrayList<>();

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    public void addBooking(Booking booking){
        bookingList.add(booking);
    }
}
