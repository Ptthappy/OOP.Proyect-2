package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Singleton {
    private static Body B=null;
    private static Player P=null;
    
    
    public static Body getBody() {
        if (B==null)    B=new Body();
        
        return B;
    }
    
    
    public static Player getPlayer() {
        if (P==null)    P=new Player();
        
        return P;
    }
    
    
    public static void resetPlayer() {
        P=null;
        getPlayer();
        
    }
    
    
}