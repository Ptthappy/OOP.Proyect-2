package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Floor {
    ToFloor T;
    public int i;
    
    
    public Floor() {  //Se crea un piso vacío
        T=null;
    }
    
    
    public Floor(Block B) {  //Se crea un piso con un bloqueo
        i=(int)(Math.random()*4);
        T=new Block(i);
    }
    
    
    public Floor(NPC N) {  //Se crea un piso con un NPC que desarrolla una mini-historia
        i=(int)(Math.random()*8);
        N=new NPC(i);
    }
    
    
    public Floor(Enemy E) {  //Se crea un piso con un enemigo
        T=Enemy.get();
    }
    
    
    public Floor(Trap T) {  //Se crea un piso con una trampa
        
    }
    
    
    public Floor(Stuff S) {  //Se crea un piso con un objeto tirado
        
    }
    
    
}