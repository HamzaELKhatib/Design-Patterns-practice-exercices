package com.hamzakh.creational.abstractfactory.exercice;

public interface Shape {

    String draw();
}


class Circle implements Shape {

    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}


class Square implements Shape {

    @Override
    public String draw() {
        return "Drawing a Square";
    }
}


class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

