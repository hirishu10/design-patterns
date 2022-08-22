package AbstractFactoryPattern.ConcreateClass;

import AbstractFactoryPattern.Abstract.PhoneBrand;
import AbstractFactoryPattern.ConcreateClass.PhoneBrands.*;

public class FactoryBrand {

    public PhoneBrand getNewMobile(String mobileName){

        if(mobileName.equals("")){
            System.out.println("Sorry Please type mobile name like: Lumia, Galaxy, Pixel, LYF.");
            return new MobileInfo();
        }
        else if(mobileName.toLowerCase().equals("lumia")){
            return new Lumia();
        }
        else if(mobileName.toLowerCase().equals("galaxy")){
            return new Galaxy();
        }
        else if(mobileName.toLowerCase().equals("pixel")){
            return new Pixel();
        }
        else if(mobileName.toLowerCase().equals("lyf")){
            return new LYF();
        }
        else {
            System.out.println("Sorry we don't have the " + mobileName + " mobile you are looking.");
            return new MobileInfo();
        }
    }
}
