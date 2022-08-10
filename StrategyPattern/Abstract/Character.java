package StrategyPattern.Abstract;

import StrategyPattern.Interface.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weapon;

    // Fight Method for all the class which inherit this
    public abstract void fight();


    // Call to use the weapon
    public void useWeapon(){
       this.weapon.useWeapon();
    }

    // Setter Method to change the weapon behaviour for all the classes which inherit this
    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
}
