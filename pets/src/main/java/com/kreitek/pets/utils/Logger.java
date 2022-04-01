package com.kreitek.pets.utils;

public class Logger {
    private static Logger instance;
    private int count;

    private Logger() { }

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();

        return instance;
    }

    public void debug(String message){
        count+=1;
        System.out.println("[debug][" + count +"] " + message);
    }
}
