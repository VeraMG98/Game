package com.company.player;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_LIFE_HERO);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (this.getHealth() > 0) {
                if (hero.getHealth() == 0) {
                    hero.setHealth(this.getHealth());
                    System.out.println("Witcher hill "
                            + hero.getClass().getSimpleName() + " " + this.getHealth());
                    this.setHealth(0);
                }
            }
        }

    }
}
