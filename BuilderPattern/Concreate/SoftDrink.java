package BuilderPattern.Concreate;

import BuilderPattern.Abstract.ColdDrink;

public class SoftDrink extends ColdDrink {

    @Override
    public String name() {
        return "SoftDrink";
    }

    @Override
    public float price() {
        return 20;
    }
}