package AbstractFactoryPattern.ConcreateClass.ConcreateOS;

import AbstractFactoryPattern.Abstract.PhoneOS;

public class Others extends PhoneOS {
    @Override
    public String printOS() {
        return "Other OS";
    }
}
