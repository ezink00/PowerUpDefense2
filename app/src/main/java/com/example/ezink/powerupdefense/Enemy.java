package com.example.ezink.powerupdefense;

public class Enemy {

    private int health, damage, speed;
    private double healthGrowth, damageGrowth, speedGrowth;

    public Enemy(int health, int damage, int speed, double healthGrowth, double damageGrowth, double speedGrowth) {
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.healthGrowth = healthGrowth;
        this.damageGrowth = damageGrowth;
        this.speedGrowth = speedGrowth;
    }

    public Enemy()
    {
        health = 0;
        damage = 0;
        speed = 0;
        healthGrowth = 0.0;
        damageGrowth = 0.0;
        speedGrowth = 0.0;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getHealthGrowth() {
        return healthGrowth;
    }

    public void setHealthGrowth(double healthGrowth) {
        this.healthGrowth = healthGrowth;
    }

    public double getDamageGrowth() {
        return damageGrowth;
    }

    public void setDamageGrowth(double damageGrowth) {
        this.damageGrowth = damageGrowth;
    }

    public double getSpeedGrowth() {
        return speedGrowth;
    }

    public void setSpeedGrowth(double speedGrowth) {
        this.speedGrowth = speedGrowth;
    }
}
