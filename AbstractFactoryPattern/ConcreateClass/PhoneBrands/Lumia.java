package AbstractFactoryPattern.ConcreateClass.PhoneBrands;

import AbstractFactoryPattern.Abstract.PhoneBody;
import AbstractFactoryPattern.Abstract.PhoneBrand;
import AbstractFactoryPattern.Abstract.PhoneOS;
import AbstractFactoryPattern.ConcreateClass.ConcreateBody.Nokia;
import AbstractFactoryPattern.ConcreateClass.ConcreateOS.Microsoft;

public class Lumia extends PhoneBrand {

    PhoneBody bodyParts = new Nokia();
    PhoneOS phoneOS = new Microsoft();

    @Override
    public void deviceInfo() {
        System.out.println("Hello Lumia Device is made with " + bodyParts.printBodyBrand() + " and " + phoneOS.printOS());
    }
}
