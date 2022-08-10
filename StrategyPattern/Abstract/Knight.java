package StrategyPattern.Abstract;

import StrategyPattern.Interface.BowAndArrowBehaviour;

public class Knight extends Character{

    public Knight() {
        weapon = new BowAndArrowBehaviour();// Defined pre weapon
    }

    @Override
    public void fight() {
        System.out.println("Knight is Fighting.....");
    }
}
