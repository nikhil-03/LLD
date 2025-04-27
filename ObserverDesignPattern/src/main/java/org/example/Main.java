package org.example;

import org.example.Observable.Bottles;
import org.example.Observable.Iphone;
import org.example.Observable.Product;
import org.example.Observer.EmailNotificationObserver;
import org.example.Observer.MobileNotificationObserver;
import org.example.Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        Product product=new Iphone();
        Product product1=new Bottles();

        NotificationObserver notificationObserver=new EmailNotificationObserver();
        NotificationObserver notificationObserver1=new MobileNotificationObserver();

        product.addProduct(notificationObserver);
        product.addProduct(notificationObserver);

        product1.addProduct(notificationObserver1);
    }
}