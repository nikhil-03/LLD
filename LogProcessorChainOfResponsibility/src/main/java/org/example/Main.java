package org.example;

import org.example.LogTypes.DebugLogs;
import org.example.LogTypes.ErrorLogs;
import org.example.LogTypes.InfoLogs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! create for ATM money types");

        LogProcessor logObj=new InfoLogs(new DebugLogs(new ErrorLogs(null)));
        logObj.log(LogProcessor.DEBUG,"need to debug this");
//        logObj.log(LogProcessor.ERROR,"error happen");
    }

}