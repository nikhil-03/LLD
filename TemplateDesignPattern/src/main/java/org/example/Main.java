package org.example;

import org.example.PaymentTypes.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user=new User(200,1,"Nikhil");
        PaymentFlow paymentFlow=new CreditCardPayment(user);
        paymentFlow.processPayment();
    }
}