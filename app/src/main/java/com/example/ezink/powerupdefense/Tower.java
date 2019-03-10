package com.example.ezink.powerupdefense;

public class Tower {


    private int damage, range;
    private double damageGrowth, rangeGrowth, attackSpeed, attackSpeedGrowth;

    public Tower()
    {
        damage = 0;
        range = 0;
        attackSpeed = 0.0;
        damageGrowth = 0.0;
        rangeGrowth = 0.0;
        attackSpeedGrowth = 0.0;

    }

    public Tower(int dmg, int rng, double as, double dmgg, double rngg, double asg)
    {
        damage = dmg;
        range = rng;
        attackSpeed = as;
        damageGrowth = dmgg;
        rangeGrowth = rngg;
        attackSpeedGrowth = asg;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public double getDamageGrowth() {
        return damageGrowth;
    }

    public void setDamageGrowth(double damageGrowth) {
        this.damageGrowth = damageGrowth;
    }

    public double getRangeGrowth() {
        return rangeGrowth;
    }

    public void setRangeGrowth(double rangeGrowth) {
        this.rangeGrowth = rangeGrowth;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getAttackSpeedGrowth() {
        return attackSpeedGrowth;
    }

    public void setAttackSpeedGrowth(double attackSpeedGrowth) {
        this.attackSpeedGrowth = attackSpeedGrowth;
    }


}
