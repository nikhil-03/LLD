package org.example;

public class Movie {
    int movieId;
    String name;
    int duration;

    public Movie(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
        this.duration=150;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
