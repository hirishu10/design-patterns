package StrategyPattern;

import StrategyPattern.Abstract.King;
import StrategyPattern.Abstract.Knight;
import StrategyPattern.Abstract.Queen;
import StrategyPattern.Interface.BowAndArrowBehaviour;
import StrategyPattern.Interface.KnifeBehaviour;
import StrategyPattern.Interface.SwordBehaviour;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithms vey independently of clients that use it.
 */
public class StrategyExample {

    public static void main(String[] args) {

        King king = new King();
        king.fight();
        king.useWeapon();
        king.setWeapon(new KnifeBehaviour());// Setting Weapon dynamically
        king.useWeapon();

        Queen queen = new Queen();
        queen.fight();
        queen.setWeapon(new BowAndArrowBehaviour());
        queen.useWeapon();

        Knight knight = new Knight();
        knight.setWeapon(new SwordBehaviour());
        knight.fight();
        knight.useWeapon();
    }
}
