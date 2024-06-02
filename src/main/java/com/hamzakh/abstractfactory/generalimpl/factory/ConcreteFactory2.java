package com.hamzakh.abstractfactory.generalimpl.factory;

import com.hamzakh.abstractfactory.generalimpl.product.ConcreteProductA2;
import com.hamzakh.abstractfactory.generalimpl.product.ConcreteProductB2;
import com.hamzakh.abstractfactory.generalimpl.product.ProductA;
import com.hamzakh.abstractfactory.generalimpl.product.ProductB;
import com.hamzakh.factorymethod.generalimpl.ConcreteProductB;

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
