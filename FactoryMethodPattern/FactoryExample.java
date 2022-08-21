package FactoryMethodPattern;

import FactoryMethodPattern.Abstract.Television;
import FactoryMethodPattern.ConcreateClass.GetTelevision;

public class FactoryExample {
    public static void main(String[] args) {

        Television tv = new GetTelevision().getNewInstance("apple");
        tv.sayHelloToNewTV();

        Television tv1 = new GetTelevision().getNewInstance("");
        tv1.sayHelloToNewTV();

        Television tv2 = new GetTelevision().getNewInstance("poi");
        tv2.sayHelloToNewTV();

    }
}
