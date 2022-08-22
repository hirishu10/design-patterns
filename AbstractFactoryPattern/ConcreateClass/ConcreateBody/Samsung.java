package AbstractFactoryPattern.ConcreateClass.ConcreateBody;

import AbstractFactoryPattern.Abstract.PhoneBody;

public class Samsung extends PhoneBody {


    @Override
    public String printBodyBrand() {
        return "Samsung";
    }
}
