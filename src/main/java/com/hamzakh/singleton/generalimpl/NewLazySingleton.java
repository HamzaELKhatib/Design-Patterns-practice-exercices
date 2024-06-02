package com.hamzakh.singleton.generalimpl;

import java.util.concurrent.atomic.AtomicReference;

/**
 * NewLazySingleton class implementing the Singleton design pattern with AtomicReference.
 * This class ensures that only one instance of NewLazySingleton is created throughout the application.
 * The instance is created only when the getInstance method is called for the first time. This is called lazy initialization.
 * AtomicReference is used in the getInstance method to ensure that only one instance of NewLazySingleton is created in a multithreaded environment.
 */
public class NewLazySingleton {
    // The single instance of NewLazySingleton that will be used throughout the application.
    // AtomicReference is used to ensure thread safety during instance creation.
    private static final AtomicReference<NewLazySingleton> instance = new AtomicReference<>();

    // Private constructor to prevent instantiation of the NewLazySingleton class from outside the class.
    private NewLazySingleton() {}

    /**
     * Method to get the single instance of NewLazySingleton.
     * If the instance does not exist, it is created with AtomicReference.
     * @return the single instance of NewLazySingleton.
     */
    public static NewLazySingleton getInstance() {
        instance.compareAndSet(null, new NewLazySingleton());
        return instance.get();
    }
}
