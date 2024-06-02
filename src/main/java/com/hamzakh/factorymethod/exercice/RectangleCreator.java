package com.hamzakh.factorymethod.exercice;

/**
 * RectangleCreator class that extends ShapeCreator.
 */
public class RectangleCreator extends ShapeCreator {
    /**
     * Method to create a Rectangle.
     * @return A Rectangle object.
     */
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
