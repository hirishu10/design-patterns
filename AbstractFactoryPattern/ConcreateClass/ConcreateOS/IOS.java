package AbstractFactoryPattern.ConcreateClass.ConcreateOS;

import AbstractFactoryPattern.Abstract.PhoneOS;

public class IOS extends PhoneOS {


    @Override
    public String printOS() {
        return "IOS OS";
    }
}
