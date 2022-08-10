package StrategyPattern.Abstract;

import StrategyPattern.Interface.SwordBehaviour;

public class King extends Character{

    public King() {
        weapon = new SwordBehaviour();// Defined pre weapon
    }

    @Override
    public void fight() {
        System.out.println("King is Fighting.....");
    }

}
