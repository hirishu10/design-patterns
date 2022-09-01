package CompositePattern.Concreate;

import CompositePattern.Interface.Composite;

public class Leaf implements Composite {

    String name;
    int amount;

    public Leaf(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public int price() {
        return amount;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + " Price is: (" + this.price() + ")");
    }
}
