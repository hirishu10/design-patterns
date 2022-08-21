package DecoratorPattern;

import DecoratorPattern.AbstractClass.AddOnsBeverage;
import DecoratorPattern.ConcreateClass.*;

public class DecoratorExample {

    public static void main(String[] args) {

        Soda soda = new Soda();

        // If you order only Soda the base price will charge
        //::> Example
        //Soda Price is ₹5
        //Total Price is: ₹5
        System.out.println("+-+-+-+-+- Soda Bill -+-+-+-+-+");
        System.out.println(soda.printBill());
        System.out.println("Total Price is: ₹" + soda.cost());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // If you order Soda with addons flavour the base price will charge with addons price
        //::> Example
        //Soda Price is ₹5
        //Total Price is: ₹5
        AddOnsBeverage sodaWithAddons = new OrangeFlavour(new MangoFlavour(soda));
        System.out.println("+-+-+-+-+- Soda Bill -+-+-+-+-+");
        System.out.println(sodaWithAddons.printBill());
        System.out.println("Total Price is: ₹" + sodaWithAddons.cost());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        // If you order Soda with all flavour the base price will charge with addons price
        //::> Example
        //Soda Price is ₹5
        //Mango Flavour Price is ₹3
        //Orange Flavour Price is ₹2
        //Apple Flavour Price is ₹4
        //MixFruit Flavour Price is ₹5
        //Total Price is: ₹19
        AddOnsBeverage sodaForMe = new MixFruitFlavour(new AppleFlavour(new OrangeFlavour(new MangoFlavour(soda))));
        System.out.println("+-+-+-+-+- Soda Bill -+-+-+-+-+");
        System.out.println(sodaForMe.printBill());
        System.out.println("Total Price is: ₹" + sodaForMe.cost());
    }
}