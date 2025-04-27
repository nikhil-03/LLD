package org.example;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Mediator{
    List<Colleague> colleagues=new ArrayList<>();
    @Override
    public void placeBid(Colleague colleague, int amount) {
        for(Colleague colleague1: colleagues){
            if(colleague1!=colleague){
                colleague1.getNotification(amount);
            }
        }
    }

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }
}
