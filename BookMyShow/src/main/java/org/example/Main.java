package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList=new ArrayList<>();
        Movie movie1 = new Movie(1, "Dhamaal"); movieList.add(movie1);
        Movie movie2 = new Movie(2, "Golmaal"); movieList.add(movie2);
        Movie movie3 = new Movie(3, "Singham"); movieList.add(movie3);

        User user1=new User("Nikhil",1);
        User user2=new User("Prakash",2);

        City city1=new City("Gurgaon",1234);
        City city2=new City("Noida",6348);
        City city3=new City("Delhi",9098);

        MovieController movieController=new MovieController();
        TheaterController theaterController=new TheaterController();

        movieController.setMovieList(movieList);
        movieController.setMovieInCity(movie2,city3);
        movieController.setMovieInCity(movie1,city3);
        movieController.setMovieInCity(movie3,city3);
        movieController.setMovieInCity(movie1,city1);

        List<Theater> theaterList=new ArrayList<>();
        Theater theater1=new Theater(1,city1,"PVR"); theaterList.add(theater1);
        Theater theater2=new Theater(1,city2,"INOX"); theaterList.add(theater2);

        theaterController.setTheaterList(theaterList);

        List<Screen> screenList=new ArrayList<>();
        Screen screen1=new Screen(1,100); screenList.add(screen1);
        Screen screen2=new Screen(1,120); screenList.add(screen2);

        theater1.setScreenList(screenList);

        Show show1 =new Show(movie2,screen1,1, LocalDateTime.now().minusHours(4));
        Show show2 =new Show(movie3,screen2,2, LocalDateTime.now().minusHours(8));

        movieController.getAllMovie();
        movieController.getAllMovieInCity(city1);

        Seat seat= show2.getScreen().isSeatAvailable();
        if(seat!=null){
            show2.getScreen().bookSeat(seat);
            Booking booking=new Booking(1, show2,user1);
            booking.addBooking(booking);
        }



    }
}