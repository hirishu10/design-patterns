package DecoratorPattern.ConcreateClass;

import DecoratorPattern.AbstractClass.Beverage;

public class Soda extends Beverage {

    @Override
    public String printBill() {
        return "Soda Price is ₹5";
    }

    @Override
    public int cost() {
        return 5;
    }
}
