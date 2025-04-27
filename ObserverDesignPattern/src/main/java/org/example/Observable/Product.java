package org.example.Observable;

import org.example.Observer.NotificationObserver;

public interface Product {
    public void addProduct(NotificationObserver notificationObserver);
    public void removeProduct(NotificationObserver notificationObserver);

    public int productCount(NotificationObserver notificationObserver);

    public void setStock();
    public void notifyUser();

}
