package BuilderPattern.Abstract;

import BuilderPattern.Concreate.Bottle;
import BuilderPattern.Interface.FoodItem;
import BuilderPattern.Interface.Packing;

public abstract class ColdDrink implements FoodItem {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
