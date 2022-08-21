package DecoratorPattern.ConcreateClass;

import DecoratorPattern.AbstractClass.AddOnsBeverage;
import DecoratorPattern.AbstractClass.Beverage;

public class MixFruitFlavour extends AddOnsBeverage {

    Beverage bevarage;

    public MixFruitFlavour(Beverage bevarage) {
        this.bevarage = bevarage;
    }


    @Override
    public String printBill() {
        return this.bevarage.printBill() + "\n" + "MixFruit Flavour Price is ₹5";
    }

    @Override
    public int cost() {
        return this.bevarage.cost() + 5;
    }
}
