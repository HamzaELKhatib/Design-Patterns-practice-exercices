package com.hamzakh.creational.abstractfactory.generalimpl.factory;

import com.hamzakh.creational.abstractfactory.generalimpl.product.ConcreteProductA2;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ConcreteProductB2;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductA;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductB;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
