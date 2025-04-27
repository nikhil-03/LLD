package org.example;

public class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    LogProcessor nextLog;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLog=nextLogProcessor;
    }

    public void log(int logLevel,String message){
         if(nextLog!=null){
             nextLog.log(logLevel,message);
         }
    }
}
