package StrategyPattern.Abstract;

import StrategyPattern.Interface.KnifeBehaviour;

public class Queen extends Character{

    public Queen() {
        weapon = new KnifeBehaviour();// Defined pre weapon
    }

    @Override
    public void fight() {
        System.out.println("Queen is Fighting.....");
    }
}
