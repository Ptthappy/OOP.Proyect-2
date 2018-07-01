package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public abstract class Stuff implements ToFloor{
    protected String name;    
    protected int character;    
    protected String rarity;
    
    public Stuff(int n) {
        this.character=n;
    }
    
    
}