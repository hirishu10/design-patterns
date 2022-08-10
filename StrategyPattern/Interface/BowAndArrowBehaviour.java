package StrategyPattern.Interface;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Using Bow and Arrow Behaviour");
    }
}
