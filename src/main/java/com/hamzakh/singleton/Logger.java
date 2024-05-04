package com.hamzakh.singleton;

/**
 * Logger class implementing the Singleton design pattern.
 * This class ensures that only one instance of Logger is created throughout the application.
 */
public class Logger {

    // The single instance of Logger that will be used throughout the application.
    private static Logger logger;

    // Private constructor to prevent instantiation of the Logger class from outside the class.
    private Logger() {
    }

    /**
     * Method to get the single instance of Logger.
     * If the instance does not exist, it is created.
     * @return the single instance of Logger.
     */
    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
