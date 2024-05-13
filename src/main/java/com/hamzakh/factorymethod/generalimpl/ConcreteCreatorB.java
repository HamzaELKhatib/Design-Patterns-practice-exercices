package com.hamzakh.factorymethod.generalimpl;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
