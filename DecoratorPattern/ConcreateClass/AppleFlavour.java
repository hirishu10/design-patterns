package DecoratorPattern.ConcreateClass;

import DecoratorPattern.AbstractClass.AddOnsBeverage;
import DecoratorPattern.AbstractClass.Beverage;

public class AppleFlavour extends AddOnsBeverage {

    Beverage bevarage;

    public AppleFlavour(Beverage bevarage) {
        this.bevarage = bevarage;
    }


    @Override
    public String printBill() {
        return this.bevarage.printBill() + "\n" + "Apple Flavour Price is ₹4";
    }

    @Override
    public int cost() {
        return this.bevarage.cost() + 4;
    }
}
