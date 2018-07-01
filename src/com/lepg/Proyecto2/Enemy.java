package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public abstract class Enemy implements ToFloor {
    protected double HP;
    protected double dmg;
    protected String name;
    protected int character;
    public Stuff loot;
    
    public Enemy(int n) {
        character=n;
    }
    
    
}