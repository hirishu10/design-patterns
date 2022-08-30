package BridgePattern.Concreate;

import BridgePattern.Interface.BallColorConfig;

public class GreenCricketBall implements BallColorConfig {

    @Override
    public void newColorBall() {
        System.out.println("This is Green Cricket Color Ball");
    }

    @Override
    public void playingCondition() {
        System.out.println("Green Cricket Ball played in Gully Cricket Match");
    }
}
