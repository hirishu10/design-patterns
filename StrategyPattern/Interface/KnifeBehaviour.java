package StrategyPattern.Interface;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Using Knife Behaviour");
    }
}
