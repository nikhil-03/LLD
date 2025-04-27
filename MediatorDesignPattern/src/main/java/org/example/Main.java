package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Auction System");
        Mediator mediator=new Auction();

        Colleague bidder1=new Bidder(mediator,"A");
        Colleague bidder2=new Bidder(mediator,"B");
        Colleague bidder3=new Bidder(mediator,"C");

        bidder1.placeBid(1000);
        bidder2.placeBid(2002);
    }
}