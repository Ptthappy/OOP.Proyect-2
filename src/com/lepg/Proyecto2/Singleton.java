package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Singleton {
    private static Body B=null;
    
    
    public static Body getBody() {
        if (B==null)    B=new Body();
        
        return B;
    }
    
    
}