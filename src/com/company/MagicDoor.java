package com.company;

public class MagicDoor {
    public Hero[] generateHeroes() {
        Hero[] heroes = new Hero[4];
        Hero warrior = new Hero(200, 20, "Physical");
        heroes[0] = warrior;
        Hero magic = new Hero(200, 20, "Magical");
        heroes[1] = magic;
        Hero kinetic = new Hero(200, 20, "Mental");
        heroes[2] = kinetic;
        Hero healer = new Hero(200, 20, "Medical");
        heroes[3] = healer;
        return heroes;
    }
}
