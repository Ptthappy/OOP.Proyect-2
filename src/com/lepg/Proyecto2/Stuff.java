package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public abstract class Stuff implements ToFloor{
    protected String name;    
    protected int character;    
    protected String rarity;
    
    protected Stuff(int n) {
        this.character=n;
    }
    
    
    public static Stuff get() {
        double x=Math.random();
        int n, m;
        m=getRarity();
        
        if(x<(11/23)) {
            
            switch(m) {
                case 0:
                    n=(int)(Math.random()*5);
                    break;
                    
                case 1:
                    n=4+(int)(Math.random()*5);
                    break;
                
                case 2:
                    n=9;
                    break;
                
                case 3:
                    n=10;
                    break;
                    
                default:
                    n=-1;
            
            }
            
            return new Consumable(n);
            
        }
        
        n=(int)(Math.random()*12);
        switch(m) {
            case 0:
                n=(int)(Math.random()*4);
                break;

            case 1:
                n=4+(int)(Math.random()*3);
                break;

            case 2:
                n=7+(int)(Math.random()*3);
                break;

            case 3:
                n=10+(int)(Math.random()*2);
                break;

            default:
                n=-1;

        }
        
        return new Weapon(n);
        
    }
    
    
    private static int getRarity() {
        double x=Math.random();
        if (x<=(8/15))
            return 0;
        
        if (x>(8/15) && x<=(12/15))
            return 1;
        
        if (x>(12/15) && x<=(14/15))
            return 2;
        
        if (x>(14/15))
            return 3;
        
        return -1;
    }
    
    
    private static void set() {
        
    }
    
}