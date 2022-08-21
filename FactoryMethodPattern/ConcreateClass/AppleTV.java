package FactoryMethodPattern.ConcreateClass;

import FactoryMethodPattern.Abstract.Television;

public class AppleTV implements Television {

    @Override
    public void sayHelloToNewTV() {
        System.out.println("Thank You for buying new AppleTV.");
    }
}
