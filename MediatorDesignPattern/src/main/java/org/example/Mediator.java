package org.example;

public interface Mediator {
    public void placeBid(Colleague colleague,int amount);
    public void addBidder(Colleague colleague);
}
