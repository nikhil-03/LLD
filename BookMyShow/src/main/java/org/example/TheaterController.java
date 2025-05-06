package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TheaterController {
    List<Theater> theaterList;

    Map<Theater,List<Show>> theaterListMap;

    public void addTheater(Theater theater){
        theaterList.add(theater);
        theaterListMap.putIfAbsent(theater,new ArrayList<>());
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }

    public void addShowsToTheater(Theater theater, Show show){
        theaterListMap.putIfAbsent(theater,new ArrayList<>());
        theaterListMap.get(theater).add(show);
    }
}
