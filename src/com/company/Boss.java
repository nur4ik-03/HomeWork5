package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int defence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public  void changeBossDefence() {
        Random r = new Random(defence);
        int defence = r.nextInt(3) + 1;
        setDefence(defence);
    }
    public void printInfo(){
        System.out.println("Boss Health:"+ health + "| Boss Damage:" + damage + "| Boss Defence:" + defence);
    }
}
