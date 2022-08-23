package SingeltonPattern;

import SingeltonPattern.ConcreateClass.SingletonPattern;

public class SingletonExample {

    public static void main(String[] args) {

        var singlePattern = SingletonPattern.getInstance();
        singlePattern.displayMessage();
    }
}
