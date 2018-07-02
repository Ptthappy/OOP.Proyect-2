package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class FloorFactory {
    private static Block B;
    private static Enemy E;
    private static Stuff S;
    private static Trap T;
    private static NPC N;
    
    
    public static Floor getFloor(int n) {
        switch(n) {
            case 0:
                return new Floor();
            case 1:
                return new Floor(B);
            case 2:
                return new Floor(E);
            case 3:
                return new Floor(S);
            case 4:
                return new Floor(T);
            case 5:
                return new Floor(N);
            default:
                return null;
        }
    }
    
    
}