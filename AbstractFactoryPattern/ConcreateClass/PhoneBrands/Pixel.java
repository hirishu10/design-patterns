package AbstractFactoryPattern.ConcreateClass.PhoneBrands;

import AbstractFactoryPattern.Abstract.PhoneBody;
import AbstractFactoryPattern.Abstract.PhoneBrand;
import AbstractFactoryPattern.Abstract.PhoneOS;
import AbstractFactoryPattern.ConcreateClass.ConcreateBody.Google;
import AbstractFactoryPattern.ConcreateClass.ConcreateOS.Android;

public class Pixel extends PhoneBrand {

    PhoneBody bodyParts = new Google();
    PhoneOS phoneOS = new Android();

    @Override
    public void deviceInfo() {
        System.out.println("Hello Pixel Device is made with " + bodyParts.printBodyBrand() + " and " + phoneOS.printOS());
    }
}
