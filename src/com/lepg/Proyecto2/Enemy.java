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
    
    protected Enemy(int n) {
        character=n;
    }
    
    public static Enemy get() {
        //7%
        double x=Math.random();
        int n;
        
        if(x<0.07) {
            n=(int)(Math.random()*9);
            return new Boss(n);
        }
        
        n=(int)(Math.random()*7);
        return new Regular(n);
        
    }
    
    
}