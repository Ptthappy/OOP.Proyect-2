package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class NPC implements ToFloor {
    private String name;
    private Stuff S;
    private int character;
    
    
    public NPC(int n) {
        character=n;
        
        switch(n) {
            case 0:
                name="Machado";
                break;
                
            case 1:
                name="Oscar";
                break;
                
            case 2:
                name="Santiago";
                break;
                
            case 3:
                name="Daniel León";
                break;
                
            case 4:
                name="Capriles Radonski";
                break;
                
            case 5:
                name="Patricia Pinto";
                break;
                
            case 6:
                name="Friendly Guajiro";
                break;
                
            case 7:
                name="El admin de Preveral in Unusual Places";
                break;
                
        }
        
    }
    
    
}