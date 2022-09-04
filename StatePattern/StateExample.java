package StatePattern;

import StatePattern.Concreate.CDPlayer;

import java.util.ArrayList;

public class StateExample {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("Song One One");
        listOne.add("Song One Two");
        listOne.add("Song One Three");
        listOne.add("Song One Four");
        listOne.add("Song One Five");

        listTwo.add("Song Two One");
        listTwo.add("Song Two Two");
        listTwo.add("Song Two Three");
        listTwo.add("Song Two Four");
        listTwo.add("Song Two Five");


        CDPlayer player = new CDPlayer();// Loading CD Player please wait.....

                                  //Disk Loading.....
        player.loadDisk(listOne);//Disk Loaded Successfully
                                //Click to Start the Player

        player.start();//CD Player Started || Condition also added
        player.currentState();//CD Player is Running
        player.stop();
        player.listOfItem();
        player.changeDisk();
        player.loadDisk(listTwo);
        player.currentState();
        player.start();
        player.start();
        player.stop();
        player.stop();
        player.currentState();
    }
}
