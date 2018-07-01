package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Weapon extends Stuff {
    private double dmg;
    private double dur;
    
    public Weapon(int n) {
        super(n);
        
        switch(n) {
            case 0:
                name="Palo";
                dmg=3;
                dur=10;
                rarity="Común";
                break;
                
            case 1:
                name="Cable Grueso";
                dmg=8;
                dur=18;
                rarity="Común";
                break;
                
            case 2:
                name="Botella Rota";
                dmg=12;
                dur=6;
                rarity="Común";
                break;
                
            case 3:
                name="Espadita de Madera";
                dmg=7;
                dur=25;
                rarity="Común";
                break;
                
            case 4:
                name="Correa del tiempo del carro de Esparza";
                dmg=12;
                dur=35;
                rarity="Poco Común";
                break;
                
            case 5:
                name="Espada menos fea";
                dmg=20;
                dur=28;
                rarity="Poco Común";
                break;
            
            case 6:
                name="Machete";
                dmg=22;
                dur=22;
                rarity="Poco Común";
                break;
            
            case 7:
                name="Látigo de Jubert";
                dmg=35;
                dur=25;
                rarity="Raro";
                break;
            
            case 8:
                name="Cuchillito de CS 1.6";
                dmg=28;
                dur=32;
                rarity="Raro";
                break;
            
            case 9:
                name="Garrote de Nerio";
                dmg=22;
                dur=42;
                rarity="Raro";
                break;
            
            case 10:
                name="Lanza de Larguinus";
                dmg=66;
                dur=250;
                rarity="Legendario";
                break;
            
            case 11:
                name="Espada hecha por Monika";
                dmg=200;
                dur=70;
                rarity="Legendario";
                break;
            
        }
        
    }
    
    
}