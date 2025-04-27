package org.example;

public class ACReceiver {
    boolean isTurnedOn=true;
    int temp;

    public void ON(){
        System.out.println("turing On");
        isTurnedOn=true;
    }
    public void OFF(){
        System.out.println("turing Off");
        isTurnedOn=false;
    }
    public void setTemperature(int temp){
        System.out.println("Setting temperature to 24");
        this.temp=temp;
    }

}
