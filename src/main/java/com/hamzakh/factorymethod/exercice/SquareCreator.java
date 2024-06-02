package com.hamzakh.factorymethod.exercice;

/**
 * SquareCreator class that extends ShapeCreator.
 */
public class SquareCreator extends ShapeCreator {
    /**
     * Method to create a Square.
     * @return A Square object.
     */
    @Override
    public Shape createShape() {
        return new Square();
    }
}
