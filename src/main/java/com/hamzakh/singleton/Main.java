package com.hamzakh.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton");

        NewLazySingleton newLazySingleton = NewLazySingleton.getInstance();
        NewLazySingleton newLazySingleton2 = NewLazySingleton.getInstance();

        if (newLazySingleton == newLazySingleton2) {
            System.out.println("The instances are the same.");
        } else {
            System.out.println("The instances are different.");
        }

        Thread thread1 = new Thread(() -> {
            NewLazySingleton newLazySingleton3 = NewLazySingleton.getInstance();
            System.out.println("Thread 1: " + newLazySingleton3);
        });

        Thread thread2 = new Thread(() -> {
            NewLazySingleton newLazySingleton4 = NewLazySingleton.getInstance();
            System.out.println("Thread 2: " + newLazySingleton4);
        });

        thread1.start();
        thread2.start();
    }
}