package com.hamzakh.abstractfactory.generalimpl.factory;

import com.hamzakh.abstractfactory.generalimpl.product.ProductA;
import com.hamzakh.abstractfactory.generalimpl.product.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
