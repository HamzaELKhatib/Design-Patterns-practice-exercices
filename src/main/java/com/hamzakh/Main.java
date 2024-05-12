package com.hamzakh;


import com.hamzakh.factorymethod.generalimpl.ConcreteCreatorA;
import com.hamzakh.factorymethod.generalimpl.ConcreteCreatorB;
import com.hamzakh.factorymethod.generalimpl.Creator;
import com.hamzakh.factorymethod.generalimpl.Product;
import com.hamzakh.factorymethod.shapefactory.*;

public class Main {
    public static void main(String[] args) {
        /*
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
        */

        /*
        ShapeCreator circleCreator = new CircleCreator();
        Shape circle = circleCreator.createShape();
        System.out.println(circle.draw());

        ShapeCreator squareCreator = new SquareCreator();
        Shape square = squareCreator.createShape();
        System.out.println(square.draw());

        ShapeCreator rectangleCreator = new RectangleCreator();
        Shape rectangle = rectangleCreator.createShape();
        System.out.println(rectangle.draw());
*/

        /*Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        System.out.println(productA.doStuff());

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        System.out.println(productB.doStuff());*/

    }
}