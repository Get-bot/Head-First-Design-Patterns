package org.designPattern.전략패턴.Question01;

public class MiniFightSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();

        Character Troll = new Troll();
        Troll.setWeapon(new AxeBehavior());
        Troll.fight();

        Character Queen = new Queen();
        Queen.setWeapon(new KnifeBehavior());
        Queen.fight();

        Character Knight = new Knight();
        Knight.setWeapon(new BowAndArrowBehavior());
        Knight.fight();

    }
}
