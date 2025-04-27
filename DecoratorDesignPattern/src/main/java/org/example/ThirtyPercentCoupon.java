package org.example;

public class ThirtyPercentCoupon extends ProductCart{
    ProductCart productCart;

    public ThirtyPercentCoupon(ProductCart productCart) {
        this.productCart = productCart;
    }

    @Override
    public int calculateDiscount(int price) {
        return (price * 70) / 100;
    }
}
