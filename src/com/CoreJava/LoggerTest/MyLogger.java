package com.CoreJava.LoggerTest;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Logger logger = Logger.getLogger(MyLogger.class.getName());

        logger.setLevel(Level.INFO);

        ConsoleHandler consoleHandler = new ConsoleHandler();

        logger.addHandler(consoleHandler);

    }
}
