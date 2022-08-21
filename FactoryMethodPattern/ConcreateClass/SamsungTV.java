package FactoryMethodPattern.ConcreateClass;

import FactoryMethodPattern.Abstract.Television;

public class SamsungTV implements Television {

    @Override
    public void sayHelloToNewTV() {
        System.out.println("Thank You for buying new Samsung TV.");

    }
}
