package com.hamzakh.singleton.generalimpl;

/**
 * LazySingleton class implementing the Singleton design pattern with double-checked locking.
 * This class ensures that only one instance of LazySingleton is created throughout the application.
 * The instance is created only when the getInstance method is called for the first time. This is called lazy initialization.
 * Double-checked locking is used in the getInstance method to ensure that only one instance of LazySingleton is created in a multithreaded environment.
 */
public class LazySingleton {
    
    // The single instance of LazySingleton that will be used throughout the application.
    private static volatile LazySingleton instance;
    
    // Private constructor to prevent instantiation of the LazySingleton class from outside the class.
    private LazySingleton() {}
    
    /**
     * Method to get the single instance of LazySingleton.
     * If the instance does not exist, it is created with double-checked locking.
     * @return the single instance of LazySingleton.
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
