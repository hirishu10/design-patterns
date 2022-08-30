package BridgePattern;

import BridgePattern.Abstract.CricketBall;
import BridgePattern.Concreate.GreenCricketBall;
import BridgePattern.Concreate.RedCricketBall;

public class BridgeExample {

    public static void main(String[] args) {
        CricketBall newBall = new CricketBall(new GreenCricketBall());
        newBall.makeBall();
        newBall.playCondition();

        newBall = new CricketBall(new RedCricketBall());
        newBall.makeBall();
        newBall.playCondition();
    }
}
