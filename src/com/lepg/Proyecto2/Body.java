package com.lepg.Proyecto2;


import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;


/**
 * @author Luis1
 */


public class Body {
    private Scanner s=new Scanner(System.in);
    Floor F[][]=new Floor[10][10];
    Player P;
    int Iter;
    double occur;
    byte spawn;
    
    
    public Body() {
        Dialog.intro();
    }
    
    
    public void Iter() {
        
        
        do {
            System.out.println("1. Nuevo Juego\n2. Ayuda\n3. Salir");
            
            try { Iter=s.nextInt(); } 
            
            catch (InputMismatchException e) {
                s=null;
                s=new Scanner(System.in);
                Iter=0;
            }
            
            switch(Iter) {
                case 1:
                    NewGame();
                    break;
                case 2:
                    Dialog.help();
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Como que estás buscando que Maduro vuelva a devaluar el bolívar");
            }
            
        }while(Iter!=3);
        
    }
    
    
    public void NewGame() {
        createMap();
        
    }
    
    
    public void createMap() {
        for (int n=0; n<10;n++)
            for (int m=0; m<10; m++) {
                occur=Math.random();
                if (occur<0.15)
                    spawn=0;
                if (occur>=0.15 && occur<0.2)
                    spawn=1;
                if (occur>=0.2 && occur<0.65)
                    spawn=2;
                if (occur>=0.65 && occur<0.70)
                    spawn=3;
                if (occur>=0.70 && occur<0.85)
                    spawn=4;
                if (occur>=0.85)
                    spawn=5;
                if (n==0 && m==0)
                    F[n][m]=FloorFactory.getFloor(spawn);
                else
                    F[n][m]=FloorFactory.getFloor(0);
            }
        
    }
    
    
}