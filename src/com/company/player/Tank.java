package com.company.player;

public class Tank extends Hero {
    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.TANK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int bossDamageRegress = boss.getDamage() / 5;
        boss.setDamage(boss.getDamage() - bossDamageRegress);
        this.setHealth(this.getHealth() - bossDamageRegress * 2);
        System.out.println("Boss damage regress " + bossDamageRegress);
    }
}
