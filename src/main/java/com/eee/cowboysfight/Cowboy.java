package com.eee.cowboysfight;

public class Cowboy {
    public String name;
    public volatile int health;
    public int damage;

    public Cowboy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}
