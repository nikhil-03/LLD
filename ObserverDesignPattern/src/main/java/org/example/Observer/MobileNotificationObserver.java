package org.example.Observer;

public class MobileNotificationObserver implements NotificationObserver{
    @Override
    public void update() {
        System.out.println("Mobile notification has been sent");
    }
}
