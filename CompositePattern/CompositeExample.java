package CompositePattern;

import CompositePattern.Concreate.Leaf;
import CompositePattern.Concreate.Parent;

public class CompositeExample {

    public static void main(String[] args) {

        var camera = new Leaf("Camera",3000);
        var battery = new Leaf("Battery",1500);
        var chargingPoint = new Leaf("ChargingPoint",500);
        var ram = new Leaf("RAM",2500);
        var processor = new Leaf("Processor",5000);

        var motherBoard = new Parent("MotherBoard");
        motherBoard.addChildren(chargingPoint);
        motherBoard.addChildren(ram);
        motherBoard.addChildren(processor);

        var body = new Parent("Body");
        body.addChildren(camera);
        body.addChildren(motherBoard);
        body.addChildren(battery);

        var mobile = new Parent("Rishu's Mobile");
        mobile.addChildren(body);


        mobile.showPrice();
    }
}