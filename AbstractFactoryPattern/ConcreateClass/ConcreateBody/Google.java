package AbstractFactoryPattern.ConcreateClass.ConcreateBody;

import AbstractFactoryPattern.Abstract.PhoneBody;

public class Google extends PhoneBody {


    @Override
    public String printBodyBrand() {
        return "Google";
    }
}
