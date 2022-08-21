package FactoryMethodPattern.ConcreateClass;

import FactoryMethodPattern.Abstract.Television;

public class GetTelevision {

    public Television getNewInstance(String tvName){

        if(tvName.equals("")){
            System.out.println("Sorry Please type tv name like: apple, samsung, one, lg.");
            return new TVInfo();
        }
        else if(tvName.toLowerCase().equals("apple")){
            return new AppleTV();
        }
        else if(tvName.toLowerCase().equals("samsung")){
            return new SamsungTV();
        }
        else if(tvName.toLowerCase().equals("lg")){
            return new LgTV();
        }
        else if(tvName.toLowerCase().equals("one")){
            return new OnePlus();
        }
        else {
            System.out.println("Sorry we don't have the " + tvName + " TV you are looking.");
            return new TVInfo();
        }
    }

}
