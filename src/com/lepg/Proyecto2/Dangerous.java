package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Dangerous extends Trap {
    private int dmg;
    
    public Dangerous(int n) {
        super(n);
        
        switch(n) {
            case 0:
                name="Hueco";
                dmg=10;
                break;
                
            case 1:
                name="Encuentro con Jerry";
                dmg=30;
                break;
                
            case 2:
                name="Encuentro con Castillo";
                //muere si no termina 30 iters después
                break;
        }
        
    }
    
    
}