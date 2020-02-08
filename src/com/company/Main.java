package com.company;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero(200, 20, "Physical ");
        Hero h2 = new Hero(200, 20, "Magical");
        Hero h3 = new Hero(200, 20, "Mental");
        Hero h4 = new Hero(200, 20, "Medical");
        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();
        Boss b1 = new Boss();
        b1.setHealth(1000);
        b1.setDamage(50);
        b1.changeBossDefence();
        b1.printInfo();
        MagicDoor md = new MagicDoor();
        md.generateHeroes();
    }
}
