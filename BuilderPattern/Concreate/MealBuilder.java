package BuilderPattern.Concreate;

public class MealBuilder {

    public Meal vegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Juice());
        return vegMeal;
    }

    public Meal nonVegMeal(){
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new SoftDrink());
        return nonVegMeal;
    }

}