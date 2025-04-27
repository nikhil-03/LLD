package org.example;

public class SetTemp implements ACCommand{
    ACReceiver acReceiver;

    public SetTemp(ACReceiver acReceiver) {
        this.acReceiver = acReceiver;
    }

    @Override
    public void execute() {
        acReceiver.setTemperature(24);
    }
}
