package StrategyPattern.Interface;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Using Sword Behaviour");
    }
}
