package org.example;

public class DiwaliOffer extends ProductOfferDecorator{
    ProductCart productCart;

    public DiwaliOffer(ProductCart productCart) {
        this.productCart = productCart;
    }

    @Override
    public int calculateDiscount(int price) {
        int discountedPrice = productCart.calculateDiscount(price);
//        System.out.println("Base discountedPrice : "+discountedPrice);
        return discountedPrice*90/100;
    }
}
