package com.hamzakh.creational.factorymethod.exercice;

/**
 * Abstract class ShapeCreator that defines the factory method.
 */
public abstract class ShapeCreator {
    /**
     * Abstract method to create a Shape.
     * @return A Shape object.
     */
    public abstract Shape createShape();
}
