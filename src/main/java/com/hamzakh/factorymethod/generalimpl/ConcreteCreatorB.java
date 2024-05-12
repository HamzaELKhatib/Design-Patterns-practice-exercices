package com.hamzakh.factorymethod.generalimpl;

public class ConcreteCreatorB extends Creator{
    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
