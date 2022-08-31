package TemplatePattern;

import TemplatePattern.Concreate.MacBookAir;

public class TemplateExample {

    public static void main(String[] args) {
        MacBookAir macBookAir = new MacBookAir("Rishu");
        macBookAir.templateForWork();// Template Method runs all the rest method we need call or execute.
    }
}
