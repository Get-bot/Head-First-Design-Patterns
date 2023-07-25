package org.designPattern.전략패턴.Question01;

public abstract class Character implements WeaponBehavior {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void fight();
}
