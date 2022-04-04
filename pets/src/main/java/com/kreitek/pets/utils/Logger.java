package com.kreitek.pets.utils;

public class Logger {
    private static Logger instance;
    private int countDebug;

    private Logger() { }

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();

        return instance;
    }

    public void debug(String message){
        countDebug++;
        System.out.printf("[debug][%d] %s \n", countDebug, message);

    }
}
