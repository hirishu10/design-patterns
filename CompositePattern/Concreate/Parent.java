package CompositePattern.Concreate;

import CompositePattern.Interface.Composite;

import java.util.ArrayList;

public class Parent implements Composite {

    String name;
    ArrayList<Composite> children  = new ArrayList<>();

    public Parent(String name) {
        this.name = name;
    }

    public void addChildren(Composite com){
        this.children.add(com);
    }

    @Override
    public int price() {
        int amount = 0;
        for (Composite c: children){
            amount += c.price();
        }
        return amount;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + " total price is ::> " + this.price());
        for (Composite c: children){
            c.showPrice();
        }
    }
}
