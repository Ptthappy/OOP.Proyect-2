package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Consumable extends Stuff {
        
    
    public Consumable(int n) {
        super(n);
        switch(n) {
            case 0:
                name="Cafesiiiiito";//heal
                rarity="Común";
                break;
                
            case 1:
                name="Chichiiiiita";//heal
                rarity="Común";
                break;
                
            case 2:
                name="Cachito de Nerio";//heal
                rarity="Común";
                break;
                
            case 3:
                name="Meme";//Cura efectos negativos
                rarity="Común";
                break;
                
            case 4:
                name="Invocación a Kevin";//escape
                rarity="Común";
                break;
                
            case 5:
                name="Susy Cookie";//heal
                rarity="Poco Común";
                break;
                
            case 6:
                name="Invocación de Machado";//1turn Stun
                rarity="Poco Común";
                break;
                
            case 7:
                name="Invocación de Genyelbert";//Player.dmg*=1.3; next turn
                rarity="Poco Común";
                break;
                
            case 8:
                name="Invocación de Chucho";//Player.MaxHP+=10;
                rarity="Poco Común";
                break;
                
            case 9:
                name="Cupón para provocar líquido en los pulmones de Morón";//to trap
                rarity="Raro";
                break;
            
                
            case 10:
                name="Nudes de Carlos Suarez";//SuperdmgInstant
                rarity="Común";
                break;
                
            default:
                
        }
        
    }
    
    
}