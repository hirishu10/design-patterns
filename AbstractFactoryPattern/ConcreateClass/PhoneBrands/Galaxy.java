package AbstractFactoryPattern.ConcreateClass.PhoneBrands;

import AbstractFactoryPattern.Abstract.PhoneBody;
import AbstractFactoryPattern.Abstract.PhoneBrand;
import AbstractFactoryPattern.Abstract.PhoneOS;
import AbstractFactoryPattern.ConcreateClass.ConcreateBody.Samsung;
import AbstractFactoryPattern.ConcreateClass.ConcreateOS.Android;

public class Galaxy extends PhoneBrand {

    PhoneBody bodyParts = new Samsung();
    PhoneOS phoneOS = new Android();

    @Override
    public void deviceInfo() {
        System.out.println("Hello Galaxy Device is made with " + bodyParts.printBodyBrand() + " and " + phoneOS.printOS());
    }
}
