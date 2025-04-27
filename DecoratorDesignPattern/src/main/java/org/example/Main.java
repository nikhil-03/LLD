package org.example;

public class Main {
    public static void main(String[] args) {
        ProductCart productCart=new ThirtyPercentCoupon(new DiwaliOffer(new MobileProduct(10)));
        int x=productCart.calculateDiscount(20000);
        System.out.println(x);
    }
}