package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Regular extends Enemy {
        
    
    public Regular(int n) {
        super(n);
        
        switch(n) {
            
            case 0:
                name="Guajiro";
                HP=30;
                dmg=4;
                //loot();
                break;
                
            case 1:
                name="Colombiano escuchando vallenato";
                HP=30;
                dmg=5;  //Pega ligeramente más fuerte que el guajiro
                //eff=Player.dmg*=0.8;  //Aturde, reduce el daño
                //loot();
                break;
                
            case 2:
                name="Bachaquera";
                HP=45;
                dmg=5;
                //loot();  //Deja loots
                break;
                
            case 3:
                name="José Castillo";
                HP=22;
                dmg=8;
                //eff=Player.HP-=5;    //Recuerda que produce cáncer
                //loot();
                break;
                
            case 4:
                name="Chabista";
                HP=50;
                dmg=3;     //No hace nada porque es retrasado
                //loot();
                break;
                
            case 5:
                name="Chino";
                HP=80;
                dmg=10;
                //loot();        //recuerda que este tiene buenos loots
                break;
                
            case 6:
                name="Bagre";
                break;
                
            default:
                
        }
        
    }
    
    
}