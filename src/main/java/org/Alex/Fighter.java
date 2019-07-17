package org.Alex;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fighter {

    Scanner in = new Scanner(System.in);
    private String name;
    private int level = 1;
    private String skill;
    private int life;
    private Weapons weapon;
    private int armour;

    public void attack(Fighter attacker, Fighter attacked) {
        int hit = 0;
        int minDamage = attacker.getWeapon().getMinDamage();
        int maxDamage = attacker.getWeapon().getMaxDamage();
        if (attacked.getArmour() >= 70 & attacked.getArmour() <= 100) {
            hit = attacker.getWeapon().setHitValue(ThreadLocalRandom.current().nextInt(minDamage, maxDamage));
            hit = hit / 3;
        } else if (attacked.getArmour() >= 30 & attacked.getArmour() <= 69) {
            hit = attacker.getWeapon().setHitValue(ThreadLocalRandom.current().nextInt(minDamage, maxDamage));
            hit = hit / 2;
        } else if (attacked.getArmour() < 30) {
            hit = attacker.getWeapon().setHitValue(ThreadLocalRandom.current().nextInt(attacker.getWeapon().getMinDamage(), attacker.getWeapon().getMaxDamage()));
        }
        System.out.println(attacker.getName() + " is attacking " + attacked.getName() + " with " + hit + " damage.");
        if (attacked.getArmour() > 0) {
            attacked.setArmour(attacked.getArmour() - hit);
            System.out.println(attacked.getName() + " armour is: " + attacked.getArmour() + " and life is: " + attacked.getLife());
            System.out.println("------------------------------");
        } else if (attacked.getArmour() <= 0) {
            attacked.setLife(attacked.getLife() - hit);
            System.out.println(attacked.getName() + " life is: " + attacked.getLife());
            System.out.println("------------------------------");

        }

//        System.out.println("Your life is: " + attacker.getLife() );


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
