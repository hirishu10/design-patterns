package AbstractFactoryPattern;

import AbstractFactoryPattern.ConcreateClass.FactoryBrand;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        FactoryBrand buyNewMobile = new FactoryBrand();

        var pixelMobile = buyNewMobile.getNewMobile("pixel");
        pixelMobile.deviceInfo();// Print:> // Hello Pixel Device is made with Google and Android OS

        var lyfMobile = buyNewMobile.getNewMobile("lyf");
        lyfMobile.deviceInfo();// Print:> // Hello LYF Device is made with Jio and Android OS

        var lumiaMobile = buyNewMobile.getNewMobile("lumia");
        lumiaMobile.deviceInfo();// Print:> // Hello Lumia Device is made with Nokia and Microsoft OS

        var galaxyMobile = buyNewMobile.getNewMobile("galaxy");
        galaxyMobile.deviceInfo();// Print:> // Hello Galaxy Device is made with Samsung and Android OS

        var onePlusMobile = buyNewMobile.getNewMobile("one");
        onePlusMobile.deviceInfo();// Print:> // Sorry we don't have the one mobile you are looking.

        var otherMobile = buyNewMobile.getNewMobile("");
        otherMobile.deviceInfo();// Print:> // Sorry Please type mobile name like: Lumia, Galaxy, Pixel, LYF.
    }
}
