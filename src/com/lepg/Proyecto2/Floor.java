package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Floor {
    ToFloor T;
    
    public Floor() {  //Se crea un piso vacío
        T=null;
    }
    
    
    public Floor(Block B) {  //Se crea un piso con un bloqueo
        T=new Block();
    }
    
    
    public Floor(NPC N) {  //Se crea un piso con un NPC que desarrolla una mini-historia
        N=new NPC();
    }
    
    
    public Floor(Enemy E) {  //Se crea un piso con un enemigo
        
    }
    
    
    public Floor(Trap T) {  //Se crea un piso con una trampa
        
    }
    
    
    public Floor(Stuff S) {  //Se crea un piso con un objeto tirado
        
    }
    
    
}