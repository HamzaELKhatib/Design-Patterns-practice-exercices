package com.hamzakh.creational.factorymethod.generalimpl;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
