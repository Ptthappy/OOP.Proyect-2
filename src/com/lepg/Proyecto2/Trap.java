package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public abstract class Trap implements ToFloor {
    protected String name;
    protected int character;
    
    protected Trap(int n) {
        character=n;
    }
    
    
}