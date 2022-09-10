package BuilderPattern.Concreate;

import BuilderPattern.Interface.FoodItem;

import java.util.ArrayList;

public class Meal {

    private ArrayList<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem foodItem){
        this.items.add(foodItem);
    }

    public float getCost(){
        float price = 0.0f;
        for(FoodItem i : items){
            price += i.price() + i.packing().packingCharges();
        }
        return price;
    }

    public void showItems(){
        for(FoodItem i : items){
            System.out.println(i.name() + "(₹" + i.price() + ")" + " with "+ i.packing().pack() + "(₹" + i.packing().packingCharges() + ")" + " and total is : ₹" + (i.price()+i.packing().packingCharges()));
        }
    }
}