package DecoratorPattern.ConcreateClass;

import DecoratorPattern.AbstractClass.AddOnsBeverage;
import DecoratorPattern.AbstractClass.Beverage;

public class MangoFlavour extends AddOnsBeverage {

    Beverage bevarage;

    public MangoFlavour(Beverage bevarage) {
        this.bevarage = bevarage;
    }


    @Override
    public String printBill() {
        return this.bevarage.printBill() + "\n" + "Mango Flavour Price is ₹3";
    }

    @Override
    public int cost() {
        return this.bevarage.cost() + 3;
    }
}
