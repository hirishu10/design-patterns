package BridgePattern.Abstract;

import BridgePattern.Interface.BallColorConfig;

public class CricketBall extends Ball{

    public CricketBall(BallColorConfig colorBalls) {
        super(colorBalls);
    }

    @Override
    public void makeBall() {
        this.colorBalls.newColorBall();
    }

    public void playCondition(){
        this.colorBalls.playingCondition();
    }
}
