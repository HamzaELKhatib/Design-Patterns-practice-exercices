package com.hamzakh.creational.abstractfactory.generalimpl.factory;

import com.hamzakh.creational.abstractfactory.generalimpl.product.ConcreteProductA1;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ConcreteProductB1;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductA;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductB;

public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
