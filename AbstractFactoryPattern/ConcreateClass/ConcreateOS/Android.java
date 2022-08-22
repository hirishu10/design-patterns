package AbstractFactoryPattern.ConcreateClass.ConcreateOS;

import AbstractFactoryPattern.Abstract.PhoneOS;

public class Android extends PhoneOS {


    @Override
    public String printOS() {
        return "Android OS";
    }
}
