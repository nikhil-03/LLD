package org.example;

public class MobileProduct extends ProductCart{
    int discountPercent;

    public MobileProduct(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int calculateDiscount(int price) {
         return (price * (100 - discountPercent)) / 100;
    }
}
