package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Quiz extends Trap {
    private int tries;
    final byte WRONG_DMG=12;
    final byte NO_ITEM=20;
    
    
    public Quiz(int n) {
        super(n);
        
        switch(n) {
            case 0:
                name="Primer examen de Evelyn";
                tries=4;
                break;
                
            case 1:
                name="Examen de Largo inventado 5 minutos antes";
                tries=2;
                break;
                
            case 2:
                name="Examen de Cornieles";
                tries=4;
                break;
                
            case 3:
                name="Guarimberos en la entrada de URU";
                tries=1;
                break;
                
        }
        
    }
    
    
}