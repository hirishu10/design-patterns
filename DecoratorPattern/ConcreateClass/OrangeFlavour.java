package DecoratorPattern.ConcreateClass;

import DecoratorPattern.AbstractClass.AddOnsBeverage;
import DecoratorPattern.AbstractClass.Beverage;

public class OrangeFlavour extends AddOnsBeverage {

    Beverage bevarage;

    public OrangeFlavour(Beverage bevarage) {
        this.bevarage = bevarage;
    }


    @Override
    public String printBill() {
        return this.bevarage.printBill() + "\n" + "Orange Flavour Price is ₹2";
    }

    @Override
    public int cost() {
        return this.bevarage.cost() + 2;
    }
}
