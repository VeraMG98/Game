package com.company.player;
import java.util.Random;

public class Faceless extends Hero {
    public Faceless(int health, int damage) {
        super(health, damage, SuperAbility.FACELESS);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int chance = random.nextInt(6);
        if (chance == 0){
            Magic magic = new Magic(100,10);
            magic.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Magic");
        } else if (chance == 1){
            Hunter hunter = new Hunter(100,10);
            hunter.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Hunter");
        }else if (chance == 2){
            Medic medic = new Medic(100, 0,5);
            medic.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Medic");
        }else if (chance == 3){
            Tank tank = new Tank(100,10);
            tank.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Tank");
        }else if (chance == 4){
            Thor thor = new Thor(100,10);
            thor.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Thor");
        }else if (chance == 5){
            Warrior warrior = new Warrior(100,10);
            warrior.applySuperAbility(boss, heroes);
            System.out.println("Faceless create hero Warrior");
        }

    }
}
