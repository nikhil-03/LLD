package org.example.LogTypes;

import org.example.LogProcessor;

public class DebugLogs extends LogProcessor{
    public DebugLogs(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel,String msg){
        if(logLevel==DEBUG){
            System.out.println("Debug log");
        }
        else
        {
            System.out.println("Pass");
//            System.out.println("Not a debug Log");
            super.log(logLevel,msg);
        }
    }
}
