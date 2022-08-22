package AbstractFactoryPattern.ConcreateClass.ConcreateOS;

import AbstractFactoryPattern.Abstract.PhoneOS;

public class Microsoft extends PhoneOS {
    @Override
    public String printOS() {
        return "Microsoft OS";
    }
}
