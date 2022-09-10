package BuilderPattern.Concreate;

import BuilderPattern.Interface.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

    @Override
    public float packingCharges() {
        return 1.5f;
    }
}
