package AbstractFactoryPattern.ConcreateClass.ConcreateBody;

import AbstractFactoryPattern.Abstract.PhoneBody;

public class Nokia extends PhoneBody {


    @Override
    public String printBodyBrand() {
        return "Nokia";
    }
}
