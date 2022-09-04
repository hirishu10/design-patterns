package StatePattern.Concreate.CDStateConcreate;

import StatePattern.Concreate.CDPlayer;
import StatePattern.Interface.CDPlayerState;


public class LoadDisk implements CDPlayerState {

    CDPlayer player;

    public LoadDisk(CDPlayer player) {
        this.player = player;
    }

    @Override
    public void doOperation() {
        System.out.println("Disk Loaded Successfully");
    }

    @Override
    public void currentState() {
        System.out.println("Disk Loaded waiting for start");
    }


    @Override
    public String now() {
        return "LoadDisk";
    }
}
