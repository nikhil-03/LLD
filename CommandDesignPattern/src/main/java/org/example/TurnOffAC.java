package org.example;

public class TurnOffAC implements ACCommand{
    ACReceiver acReceiver;

    public TurnOffAC(ACReceiver acReceiver) {
        this.acReceiver = acReceiver;
    }

    @Override
    public void execute() {
       acReceiver.OFF();
    }
}
