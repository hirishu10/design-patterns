package AbstractFactoryPattern.ConcreateClass.PhoneBrands;

import AbstractFactoryPattern.Abstract.PhoneBody;
import AbstractFactoryPattern.Abstract.PhoneBrand;
import AbstractFactoryPattern.Abstract.PhoneOS;
import AbstractFactoryPattern.ConcreateClass.ConcreateBody.Jio;
import AbstractFactoryPattern.ConcreateClass.ConcreateOS.Android;

public class LYF extends PhoneBrand {

    PhoneBody bodyParts = new Jio();
    PhoneOS phoneOS = new Android();

    @Override
    public void deviceInfo() {
        System.out.println("Hello LYF Device is made with " + bodyParts.printBodyBrand() + " and " + phoneOS.printOS());
    }
}
