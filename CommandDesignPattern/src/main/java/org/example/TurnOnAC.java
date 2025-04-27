package org.example;

public class TurnOnAC implements ACCommand{
    ACReceiver acReceiver;

    public TurnOnAC(ACReceiver acReceiver) {
        this.acReceiver = acReceiver;
    }

    @Override
    public void execute() {
        acReceiver.ON();
    }
}
