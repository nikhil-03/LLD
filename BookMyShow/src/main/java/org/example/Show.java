package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    LocalDateTime startTime;
    Screen screen;
    List<Seat> bookedSeats;

    public Show(Movie movie, Screen screen, int showId, LocalDateTime startTime) {
        this.movie = movie;
        this.screen = screen;
        this.showId = showId;
        this.startTime = startTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
