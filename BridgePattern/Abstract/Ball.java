package BridgePattern.Abstract;

import BridgePattern.Interface.BallColorConfig;

public abstract class Ball {

    BallColorConfig colorBalls;

    public Ball(BallColorConfig colorBalls) {
        this.colorBalls = colorBalls;
    }

    public abstract void makeBall();
}
