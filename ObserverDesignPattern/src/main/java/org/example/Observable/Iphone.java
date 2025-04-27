package org.example.Observable;

import org.example.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Product{
    List<NotificationObserver> notificationObserversList=new ArrayList<>();
    @Override
    public void addProduct(NotificationObserver notificationObserver) {
        if(notificationObserversList.isEmpty()){
            notificationObserversList.add(notificationObserver);
            notifyUser();
        }
        else{
            notificationObserversList.add(notificationObserver);
        }
    }

    @Override
    public void removeProduct(NotificationObserver notificationObserver) {
       if(notificationObserversList.isEmpty()){
           System.out.println("No items to remove");
       }else{
           int n=notificationObserversList.size();
           notificationObserversList.remove(n-1);
       }
    }

    @Override
    public int productCount(NotificationObserver notificationObserver) {
        return notificationObserversList.size();
    }

    @Override
    public void setStock() {

    }

    @Override
    public void notifyUser() {
        for(NotificationObserver notificationObserver:notificationObserversList){
            notificationObserver.update();
        }
    }
}
