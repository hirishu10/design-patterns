package StrategyPattern.Abstract;

import StrategyPattern.Interface.AxeBehaviour;

public class Troll extends Character{

    public Troll(){
        weapon = new AxeBehaviour();// Defined pre weapon
    }

    @Override
    public void fight() {
        System.out.println("Troll is Fighting.....");
    }
}
