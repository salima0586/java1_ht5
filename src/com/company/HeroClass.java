package com.company;

public abstract class HeroClass implements MyInterface {
    private int damage;
    private int health;
    private String havingSuperAbility;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getHavingSuperAbility() {
        return havingSuperAbility;
    }

    public void setHavingSuperAbility(String havingSuperAbility) {
        this.havingSuperAbility = havingSuperAbility;
    }
}
