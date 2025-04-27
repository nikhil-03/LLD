package org.example.LogTypes;

import org.example.LogProcessor;

public class InfoLogs extends LogProcessor {
    public InfoLogs(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel,String msg){
        if(logLevel==INFO){
            System.out.println("Info log");
        }else{
            System.out.println("Pass");
            super.log(logLevel,msg);
        }
    }
}
