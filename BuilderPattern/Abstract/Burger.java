package BuilderPattern.Abstract;

import BuilderPattern.Concreate.Wrapper;
import BuilderPattern.Interface.FoodItem;
import BuilderPattern.Interface.Packing;

public abstract class Burger implements FoodItem {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}