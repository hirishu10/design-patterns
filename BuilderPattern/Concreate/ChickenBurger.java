package BuilderPattern.Concreate;

import BuilderPattern.Abstract.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30;
    }
}