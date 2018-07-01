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
    double ocur;
    int spawn;
    
    
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
                    //NewGame();
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
        int i=(int) (Math.random() * 5);
        
    }
    
    
    public void createMap() {
        for (int n=0; n<10;n++)
            for (int m=0; m<10; m++) {
                ocur=Math.random();
                if (ocur<0.3)
                    
                F[n][m]=FloorFactory.getFloor(n);
            }
            
            
    }
    
    
}