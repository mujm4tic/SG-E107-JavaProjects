package com.sparta.mm.week2.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger("myLogger");

    public static void main(String[] args) {

        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/mm/logger/mylog.log");
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new CustomFormatter());

        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.setLevel(Level.INFO); //at level or higher
        logger.log(Level.INFO, "I am in the main method");
        logger.log(Level.WARNING, "This is a warning!");
    }
}
