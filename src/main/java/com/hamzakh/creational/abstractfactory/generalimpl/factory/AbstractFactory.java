package com.hamzakh.creational.abstractfactory.generalimpl.factory;

import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductA;
import com.hamzakh.creational.abstractfactory.generalimpl.product.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
