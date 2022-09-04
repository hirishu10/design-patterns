package StatePattern.Concreate.CDStateConcreate;

import StatePattern.Concreate.CDPlayer;
import StatePattern.Interface.CDPlayerState;

public class ChangeDisk implements CDPlayerState {

    CDPlayer player;

    public ChangeDisk(CDPlayer player) {
        this.player = player;
    }

    @Override
    public void doOperation() {

        if(player.cdItems.size() < 1){
            System.out.println("There is nothing to eject.....");
        }
        else{
            this.player.cdItems.clear();
            System.out.println("Disk Ejecting from CD Player.....");
        }

    }

    @Override
    public void currentState() {
        System.out.println("CD Disk Changing Player");
    }

    @Override
    public String now() {
        return "ChangeDisk";
    }
}
