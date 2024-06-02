package com.hamzakh;


public class Main {
    public static void main(String[] args) {

        // Singleton
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

        // Factory Method (Exercise)
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

        // Factory Method
        /*
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        System.out.println(productA.doStuff());

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        System.out.println(productB.doStuff());
        */

        // Abstract Factory (Exercise)
        /*
        AbstractFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        System.out.println(circle.draw());

        Shape square = shapeFactory.getShape("SQUARE");
        System.out.println(square.draw());

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        System.out.println(rectangle.draw());

        AbstractFactory colorFactory = new ColorFactory();

        Color red = colorFactory.getColor("RED");
        System.out.println(red.fill());

        Color green = colorFactory.getColor("GREEN");
        System.out.println(green.fill());

        Color blue = colorFactory.getColor("BLUE");
        System.out.println(blue.fill());
         */

        // Abstract Factory
        /*
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.operationA();
        productB1.operationB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.operationA();
        productB2.operationB();
        */

    }
}