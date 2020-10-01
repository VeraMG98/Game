package com.company.player;

import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STAN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean stan;
        Random r = new Random();
        int chance = r.nextInt(5);
        if (chance == 2){
            stan = true;
            boss.setDamage(0);
            System.out.println("Boss off");
        } else {
            stan = false;
            boss.setDamage(50);
        }
        if (stan){
            boss.setDamage(0);
        }
    }
}
