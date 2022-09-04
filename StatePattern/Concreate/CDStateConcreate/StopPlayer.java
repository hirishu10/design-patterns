package StatePattern.Concreate.CDStateConcreate;

import StatePattern.Concreate.CDPlayer;
import StatePattern.Interface.CDPlayerState;

public class StopPlayer implements CDPlayerState {

    CDPlayer player;

    public StopPlayer(CDPlayer player) {
        this.player = player;
    }

    @Override
    public void doOperation() {
        if(player.cdItems.size() < 1){
            System.out.println("Please Load some disk to play and then stop");
        }
        else if(this.now().equals("StopPlayer") && !player.isPlaying){
            System.out.println("Player is already stopped");
        }
        else{
            System.out.println("CD Player Stopped");
        }
    }

    @Override
    public void currentState() {
        System.out.println("CD Player is Stopped");
    }

    @Override
    public String now() {
        return "StopPlayer";
    }
}
