package StatePattern.Concreate;

import StatePattern.Concreate.CDStateConcreate.*;
import StatePattern.Interface.CDPlayerState;

import java.util.ArrayList;

public class CDPlayer {

    CDPlayerState state;
    public ArrayList<String> cdItems = new ArrayList<>();
    public boolean isPlaying = false;
    public CDPlayer() {
        System.out.println("Loading CD Player please wait.....");
        this.state = new InitializeCD(this);
    }

    public void loadDisk(ArrayList<String> newList){
        System.out.println("Disk Loading.....");
        this.cdItems.addAll(newList);
        this.state = new LoadDisk(this);
        this.state.doOperation();
        System.out.println("Click to Start the Player");
    }

    public void start(){
        this.state = new StartPlayer(this);
        this.state.doOperation();
        this.isPlaying = true;

    }

    public void stop(){
        this.state = new StopPlayer(this);
        this.state.doOperation();
        this.isPlaying = false;
    }


    public void changeDisk(){
        this.state = new ChangeDisk(this);
        this.state.doOperation();
    }

    public void currentState(){
        this.state.currentState();
    }


    public void listOfItem(){
        int index = 1;
        System.out.println("List Below: ");
        for (String each: this.cdItems){
            System.out.println(index + ". " + each + ".");
            index++;
        }
    }

}
