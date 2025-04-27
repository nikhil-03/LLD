package org.example;

public class HeadPhoneProduct extends ProductCart{
    int discountPercent;

    public HeadPhoneProduct(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int calculateDiscount(int price) {
        return price*((100-discountPercent)/100);
    }
}
