package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Block implements ToFloor {
    private String name;    
    private Stuff topass;
    
    
    public Block(int n) {
        
        switch(n) {
            
            case 0:
                name="Morón";
                break;
                
            case 1:
                name="Guarimba";
                break;
                
            case 2:
                name="Miku Hatsune";
                break;
                
            case 3:
                name="Mensualidad Atrasada";
                break;
        
        }
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    
}