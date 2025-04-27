package org.example.Observable;

import org.example.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class Bottles implements Product{
    List<NotificationObserver> notificationObserverList=new ArrayList<>();
    @Override
    public void addProduct(NotificationObserver notificationObserver) {
        if(notificationObserverList.isEmpty()){
            notificationObserverList.add(notificationObserver);
            notifyUser();
        }
        else {
            notificationObserverList.add(notificationObserver);
        }

    }

    @Override
    public void removeProduct(NotificationObserver notificationObserver) {
       System.out.println("Removing one bottle");
    }

    @Override
    public int productCount(NotificationObserver notificationObserver) {
        return notificationObserverList.size();
    }

    @Override
    public void setStock() {

    }

    @Override
    public void notifyUser() {
       for(NotificationObserver notificationObserver:notificationObserverList){
           notificationObserver.update();
       }
    }
}
