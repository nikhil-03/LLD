package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bill {
    Reservation reservation;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
    }
    public long generateBill(){
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(reservation.startTime, exitTime);
        long minutes = duration.toMinutes();
        int hourlyRentalCost=reservation.vehicle.hourlyRentalCost;
        reservation.vehicle.isAvailable=true;
        return minutes*hourlyRentalCost;
    }
}
