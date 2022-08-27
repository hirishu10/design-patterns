package FacadePattern.Concreate;

import FacadePattern.Interface.DoOperation;

public class AddOperation implements DoOperation {

    @Override
    public void operation(int sumOne,int sumTwo) {
        System.out.println("Sum of " + sumOne + " and " + sumTwo + " = " + (sumOne + sumTwo));
    }
}
