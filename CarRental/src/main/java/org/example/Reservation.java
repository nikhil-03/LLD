package org.example;

import java.time.LocalDateTime;

public class Reservation {
    LocalDateTime startTime;
    LocalDateTime endTime;
    User user;
    Vehicle vehicle;

    public Reservation( LocalDateTime startTime,LocalDateTime endTime, User user, Vehicle vehicle) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.user = user;
        this.vehicle = vehicle;
    }
}
