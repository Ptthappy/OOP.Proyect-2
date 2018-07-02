package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Floor {
    ToFloor T;
    public int i;
    
    
    public Floor() {  //Se crea un piso vacío
        this.T=null;
    }
    
    
    public Floor(Block B) {  //Se crea un piso con un bloqueo
        i=(int)(Math.random()*4);
        this.T=new Block(i);
    }
    
    
    public Floor(NPC N) {  //Se crea un piso con un NPC que desarrolla una mini-historia
        i=(int)(Math.random()*8);
        this.T=new NPC(i);
    }
    
    
    public Floor(Enemy E) {  //Se crea un piso con un enemigo
        this.T=Enemy.get();
    }
    
    
    public Floor(Trap T) {  //Se crea un piso con una trampa
        this.T=Trap.get();
    }
    
    
    public Floor(Stuff S) {  //Se crea un piso con un objeto tirado
        this.T=Stuff.get(); 
   }
    
    
}