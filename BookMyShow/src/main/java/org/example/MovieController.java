package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityMovieList= new HashMap<>();
    List<Movie> movieList=new ArrayList<>();

    public Map<City, List<Movie>> getCityMovieList() {
        return cityMovieList;
    }

    public void setCityMovieList(Map<City, List<Movie>> cityMovieList) {
        this.cityMovieList = cityMovieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public void setMovieInCity(Movie movie,City city){
        cityMovieList.putIfAbsent(city,new ArrayList<>());
        if(!cityMovieList.isEmpty())
          cityMovieList.get(city).add(movie);
        else {
            System.out.println("Can't find city");
        }
    }

    public List<Movie> getAllMovie(){
        for (Movie movie: movieList)System.out.println("Movie : "+movie.name);
        if(movieList.isEmpty())return new ArrayList<>();
        return movieList;
    }

    public List<Movie> getAllMovieInCity(City city){
        List<Movie> movies=cityMovieList.get(city);
        if(movies==null)return new ArrayList<>();
        for (Movie movie: movies)System.out.println("Movie : "+movie.name+" City : "+city.name);
        if(movies.isEmpty()){
            return new ArrayList<>();
        }else
            return movies;

    }
}
