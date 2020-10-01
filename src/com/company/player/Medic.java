package com.company.player;

public class Medic extends Hero {

    private final int hillPoints;

    public Medic(int health, int damage, int hillPoints) {
        super(health, damage, SuperAbility.HILL);
        this.hillPoints = hillPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int min = heroes[0].getHealth();
        int k = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() < min) {
                min = heroes[i].getHealth();
                k = i;
            }
        }
        if (this != heroes[k] && min < 100 && min != 0){
            heroes[k].setHealth(heroes[k].getHealth() + hillPoints);
            System.out.println("Hill hero " + heroes[k].getClass().getSimpleName() + " " + hillPoints);
        }




        /*for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + hillPoints);
                System.out.println("Medic hill hero " + heroes[i].getClass().getSimpleName());
            }
        }
        */
    }
}
