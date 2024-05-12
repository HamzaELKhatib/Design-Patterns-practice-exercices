package com.hamzakh.factorymethod.shapefactory;

/**
 * Shape interface that all shapes will implement.
 */
public interface Shape {
    /**
     * Method to draw the shape.
     * @return A string describing the drawing action.
     */
    String draw();
}

/**
 * Circle class that implements the Shape interface.
 */
class Circle implements Shape {
    /**
     * Method to draw a Circle.
     * @return A string stating that a Circle is being drawn.
     */
    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}

/**
 * Square class that implements the Shape interface.
 */
class Square implements Shape {
    /**
     * Method to draw a Square.
     * @return A string stating that a Square is being drawn.
     */
    @Override
    public String draw() {
        return "Drawing a Square";
    }
}

/**
 * Rectangle class that implements the Shape interface.
 */
class Rectangle implements Shape {
    /**
     * Method to draw a Rectangle.
     * @return A string stating that a Rectangle is being drawn.
     */
    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

