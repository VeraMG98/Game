package com.company.player;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int boostWar = r.nextInt(5) + 2;
        this.setDamage(getDamage() * boostWar);
    }
}
