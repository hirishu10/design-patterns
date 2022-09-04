package StatePattern.Concreate.CDStateConcreate;

import StatePattern.Concreate.CDPlayer;
import StatePattern.Interface.CDPlayerState;

public class InitializeCD implements CDPlayerState {

    CDPlayer player;

    public InitializeCD(CDPlayer player) {
        this.player = player;
    }

    @Override
    public void doOperation() {
        System.out.println("Please Insert CD Disk.....");
    }

    @Override
    public void currentState() {
        System.out.println("CD Player is initialized");
    }

    @Override
    public String now() {
        return "InitializeCD";
    }
}
