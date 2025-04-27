package org.example.LogTypes;

import org.example.LogProcessor;

public class ErrorLogs extends LogProcessor{

    public ErrorLogs(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel,String msg){
        if(logLevel==ERROR){
            System.out.println("Error log");
        }else{
            System.out.println("Pass");
            super.log(logLevel,msg);
        }
    }
}
