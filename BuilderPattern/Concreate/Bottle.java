package BuilderPattern.Concreate;

import BuilderPattern.Interface.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }

    @Override
    public float packingCharges() {
        return 5.0f;
    }
}
