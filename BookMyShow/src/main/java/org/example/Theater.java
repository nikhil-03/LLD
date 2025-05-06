package org.example;

import java.util.List;

public class Theater {
    int id;
    String name;
    List<Show> showList;
    List<Screen> screenList;
    City city;

    public Theater(int id,City city,String name) {
        this.id = id;
        this.city=city;
        this.name=name;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Show> getShowsList() {
        return showList;
    }

    public void setShowsList(List<Show> showList) {
        this.showList = showList;
    }
}
