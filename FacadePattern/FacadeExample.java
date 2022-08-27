package FacadePattern;

import FacadePattern.Concreate.CustomMath;

public class FacadeExample {

    public static void main(String[] args) {
        CustomMath math = new CustomMath();
        math.add(10,23);
        math.sub(10,23);
        math.mul(10,23);
        math.div(23,10);
    }
}
