package com.company.player;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int boost = r.nextInt(10) + 1;
        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + boost);
        }
    }
}
