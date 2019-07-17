package org.Alex;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    Scanner in = new Scanner(System.in);
    private Fighter competitor1;
    private Fighter competitor2;

    public void start() {
        initFighter();
//        competitor1.attack(competitor1,competitor2);
//        competitor1.attack(competitor1,competitor2);
//        competitor1.attack(competitor1,competitor2);
        rounds();

    }


    public void initFighter() {
        Weapons sword = new Weapons();
        sword.setName("Sword");
        sword.setMinDamage(4);
        sword.setMaxDamage(20);
//        sword.setDamaage(5 + (int) (Math.random() * 10));
        Fighter fighter = new Fighter();
        fighter.setName(getNameFromUser());
        fighter.setArmour(100);
        fighter.setLife(100);
        fighter.setWeapon(sword);
        competitor1 = fighter;
//        competitor1.getName();
//        competitor1.setArmour(100);
//        competitor1.setLevel(1);
//        competitor1.setLife(100);
//        competitor1.setWeapon(sword);

        Weapons axe = new Weapons();
        axe.setName("Axe");
        axe.setMinDamage(4);
        axe.setMaxDamage(20);
//        axe.setDamaage(5 + (int) (Math.random() * 10));
        Fighter fighter2 = new Fighter();
        fighter2.setName(getNameFromUser());
        fighter2.setLife(100);
        fighter2.setArmour(100);
        fighter2.setWeapon(axe);
        competitor2 = fighter2;

    }

    private String getNameFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your fighter's name:");
        return in.nextLine();

    }

    private void battle() {
        competitor1.setLife(100);
        competitor1.setArmour(100);
        competitor2.setLife(100);
        competitor2.setArmour(100);

        do {
            if (competitor1.getLife() > 0) {
                competitor1.attack(competitor1, competitor2);
            } else {
                break;
            }
            if (competitor2.getLife() > 0) {
                competitor2.attack(competitor2, competitor1);
            } else {
                break;
            }
        } while (competitor1.getLife() > 0 && competitor2.getLife() > 0);


    }
    private int getNumberOfRoundsFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many rounds you want to play?:");
        return in.nextInt();
    }

    private void rounds() {
        int totalRounds = getNumberOfRoundsFromUser();
        int roundsWon1 = 0;
        int roundsWon2 = 0;
        for (int i = 1; i <= totalRounds; i++) {
            System.out.println("ROUND " + i);
            System.out.println("*****************");
            battle();
            if (competitor1.getLife() <= 0) {
                System.out.println("The round winner is:.. " + competitor2.getName());
                roundsWon2++;

            } else if (competitor2.getLife() <= 0) {
                System.out.println("The round winner is:.. " + competitor1.getName());
                roundsWon1++;

            }

        }
        if (roundsWon1>roundsWon2){
            System.out.println("The winner is... " + competitor1.getName());
        }else if(roundsWon1<roundsWon2){
            System.out.println("The winner is... " + competitor2.getName());
        }else {
            System.out.println("There is a draw!");
        }
        System.out.println("Stats:");
        System.out.println(competitor1.getName() + " won " + roundsWon1 + " rounds");
        System.out.println(competitor2.getName() + " won " + roundsWon2 + " rounds");
    }


}
