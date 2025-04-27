package org.example;

public class ACInvoker {
    ACCommand acCommand;
    public void setCommand(ACCommand acCommand){
        this.acCommand=acCommand;
    }
    public void pressButton(){
        acCommand.execute();
    }
}
