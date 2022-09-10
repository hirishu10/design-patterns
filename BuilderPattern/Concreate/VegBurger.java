package BuilderPattern.Concreate;

import BuilderPattern.Abstract.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 20;
    }
}