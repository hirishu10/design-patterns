package BridgePattern.Concreate;

import BridgePattern.Interface.BallColorConfig;

public class RedCricketBall implements BallColorConfig {

    @Override
    public void newColorBall() {
        System.out.println("This is Red Cricket Color Ball");
    }

    @Override
    public void playingCondition() {
        System.out.println("Red Cricket Ball played in Test Match");
    }
}
