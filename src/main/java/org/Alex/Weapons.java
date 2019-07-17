package org.Alex;

public class Weapons {

    private String name;
    private int minDamage;
    private int maxDamage;
    private int hitValue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHitValue() {
        return hitValue;
    }

    public int setHitValue(int hitValue) {
        this.hitValue = hitValue;
        return hitValue;
    }
}
