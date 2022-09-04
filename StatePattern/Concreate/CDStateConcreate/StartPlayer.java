package StatePattern.Concreate.CDStateConcreate;

import StatePattern.Concreate.CDPlayer;
import StatePattern.Interface.CDPlayerState;


public class StartPlayer implements CDPlayerState {

    CDPlayer player;

    public StartPlayer(CDPlayer player) {
        this.player = player;
    }

    @Override
    public void doOperation() {

        if(player.cdItems.size() < 1){
            System.out.println("Please Load some disk to play");
        }
        else if(this.now().equals("StartPlayer") && player.isPlaying){
            System.out.println("Player is playing the songs.");
        }
        else{
            System.out.println("CD Player Started");
        }
    }

    @Override
    public void currentState() {
        System.out.println("CD Player is Running");
    }

    @Override
    public String now() {
        return "StartPlayer";
    }
}
