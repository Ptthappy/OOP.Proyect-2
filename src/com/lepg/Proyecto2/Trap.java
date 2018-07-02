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
    
    public static Trap get() {
        double x=Math.random();
        int n;
        
        if(x<(3/7)) {
            n=(int)(Math.random()*3);
            return new Dangerous(n);
        }
        
        n=(int)(Math.random()*4);
        return new Quiz(n);
        
    }
    
    
}