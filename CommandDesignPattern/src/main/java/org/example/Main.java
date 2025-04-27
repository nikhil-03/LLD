package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Invoker , Command , Receiver");
        ACReceiver acReceiver=new ACReceiver();
        ACInvoker acInvoker=new ACInvoker();
        acInvoker.setCommand(new TurnOnAC(acReceiver));
        acInvoker.pressButton();


        acInvoker.setCommand(new TurnOffAC(acReceiver));
        acInvoker.pressButton();

        acInvoker.setCommand(new SetTemp(acReceiver));
        acInvoker.pressButton();

    }
}