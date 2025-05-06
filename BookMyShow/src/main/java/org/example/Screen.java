package org.example;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int id;
    int seatCapacity;
    SeatType seatType;
    List<Seat> seatList=new ArrayList<>();

    public Screen(int id, int seatCapacity) {
        this.id = id;
        this.seatCapacity = seatCapacity;
        for(int i=1;i<=seatCapacity;i++){
            Seat seat=new Seat(i%10,i/10);
            seatList.add(seat);
        }
    }
    public Seat isSeatAvailable(){
        for(Seat seat: seatList){
            if(seat.isAvailable){
                return seat;
            }
            else {
                System.out.println("No seats Available");

            }
        }return null;
    }
    public void bookSeat(Seat seat){
        seat.isAvailable=false;
        System.out.println("Seat has been booked");

    }
}
