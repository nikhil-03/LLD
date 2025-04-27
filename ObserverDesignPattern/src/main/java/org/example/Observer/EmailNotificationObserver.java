package org.example.Observer;

public class EmailNotificationObserver implements NotificationObserver{
    @Override
    public void update() {
        System.out.println("Email sent to user");
    }
}
