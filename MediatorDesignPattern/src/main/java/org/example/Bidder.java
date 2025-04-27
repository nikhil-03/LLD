package org.example;

public class Bidder implements Colleague{
    Mediator mediator;
    String name;

    public Bidder(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this,amount);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNotification(int bidAmount) {
        System.out.println("Bidding has been made for Rs : "+bidAmount+" now check for "+name);
    }
}
