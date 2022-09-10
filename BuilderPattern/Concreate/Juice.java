package BuilderPattern.Concreate;

import BuilderPattern.Abstract.ColdDrink;

public class Juice extends ColdDrink {

    @Override
    public String name() {
        return "Juice";
    }

    @Override
    public float price() {
        return 25;
    }
}
