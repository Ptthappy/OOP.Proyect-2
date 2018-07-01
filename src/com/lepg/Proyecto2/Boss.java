package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Boss extends Enemy {
   
   
    public Boss(int n) {
        super(n);
        
        switch(n) {
            
            case 0:
                name="Morón";
                HP=1200;
                dmg=12;
                break;
                
            case 1:
                name="Esparza";
                HP=800;
                dmg=5;
                break;
                
            case 2:
                name="Las pantaletas de Elvia";
                HP=300;
                dmg=20;
                break;
                
            case 3:
                name="Becky Saras";
                HP=2000;
                dmg=4;
                break;
                
            case 4:
                name="Trumpiz";  //Si no te ríes con esto me mato
                HP=500;
                dmg=10;
                break;
                
            case 5:
                name="Cornieles angry";
                HP=150;
                dmg=30;
                break;
                
            case 6:
                name="Oscar [Unbeatable]";
                HP=3000;
                dmg=10;
                break;
                
            case 7:
                name="Marian";  //Mi ex :(
                HP=999999999;  //compa esto no es un juego xfabor ayuda :(
                dmg=9999;
                break;
                
            case 8:
                name="Dinosaurio de Google Chrome";  //Muy adorable
                HP=2000;
                dmg=3;
                break;
                
            default:
                
        }
        
    }
    
    
}