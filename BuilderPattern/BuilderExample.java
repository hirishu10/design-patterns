package BuilderPattern;

import BuilderPattern.Concreate.Meal;
import BuilderPattern.Concreate.MealBuilder;
import BuilderPattern.Concreate.VegBurger;

public class BuilderExample {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        var sundayNonVegOffer = mealBuilder.nonVegMeal();
        System.out.println("Sunday Non-Veg Offer:");
        sundayNonVegOffer.showItems();
        System.out.println("Total Cost: ₹" + sundayNonVegOffer.getCost());


        System.out.println("--------------------");


        var sundayVegOffer = mealBuilder.vegMeal();
        System.out.println("Sunday Veg Offer:");
        sundayVegOffer.showItems();
        System.out.println("Total Cost: ₹" + sundayVegOffer.getCost());


        System.out.println("--------------------");

        var customMeal = new Meal();
        System.out.println("Custom Order:");
        customMeal.addItem(new VegBurger());
        customMeal.showItems();
        System.out.println("Total Cost: ₹" + customMeal.getCost());

    }
}
