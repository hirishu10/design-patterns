package FactoryMethodPattern.ConcreateClass;

import FactoryMethodPattern.Abstract.Television;

public class OnePlus implements Television {

    @Override
    public void sayHelloToNewTV() {
        System.out.println("Thank You for buying new OnePlusTV.");

    }
}
