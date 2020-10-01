package com.company.game;

import com.company.player.*;

public class RPGGame {

    public static void start() {
        Boss boss = new Boss(50000, 50);
        Warrior warrior = new Warrior(250, 15);
        Hunter hunter = new Hunter(260, 10);
        Medic doc = new Medic(230, 10, 15);
        Magic mag = new Magic(270, 20);
        Medic medic = new Medic(290, 20, 5);
        Thor thor = new Thor(215,22);
        Tank tank = new Tank(280,5);
        Witcher witcher = new Witcher(255,0);
        Faceless faceless = new Faceless(260,15);
        Hero[] heroes = {warrior, hunter, doc, mag, medic, thor, tank, witcher, faceless};
        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round (Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0)
            bossHits(boss, heroes);
        heroesHits(boss, heroes);
        applySuper(boss, heroes);
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes){
        System.out.println("____________________________________");
        System.out.println("Boss health " + boss.getHealth());
        for (Hero hero : heroes) {
            System.out.println(hero.getClass().getSimpleName()
                    + " health " + hero.getHealth());
        }
        System.out.println("____________________________________");
    }

    public static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if(boss.getHealth() <= 0){
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return  allHeroesDead;
    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() - boss.getDamage());
            }
        }
    }

    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (boss.getHealth() > 0 && hero.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - hero.getDamage());
            }
        }
    }

    private static void applySuper(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.applySuperAbility(boss, heroes);
            }
        }
    }
}