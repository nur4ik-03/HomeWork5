package com.company;

public class Hero {
    private int health;
    private int damage;
    private String typeDamage;

    public Hero(int health, int damage, String typeDamage) {
        this.health = health;
        this.damage = damage;
        this.typeDamage = typeDamage;
    }

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

    public String getTypeDamage() {
        return typeDamage;
    }

    public void setTypeDamage(String typeDamage) {
        this.typeDamage = typeDamage;
    }

    public void printInfo() {
        System.out.println("Hero Health:" + health + "| Hero Damage:" + damage + "| Hero typeDamage:" + typeDamage);
    }
}






