package com.lepg.Proyecto2;


import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Luis1
 */


public class Body {
    private Scanner s=new Scanner(System.in);
    Floor F[];
    Player P;
    int Iter;
    
    public Body() {
        System.out.println("Este era un día lluvioso en Delta Amacuro. Luis1, un estudiante, acababa de despertar de entre el medio del monte." + 
                "\nÉl no tenía idea, estaba muy confundido, ya que no podía recordar nada, pero francamente, se había levantado en el medio de la nada" + 
                "\ndespués de perder la conciencia en senda rumba después de consumir Preveral con Ginebra. Él no sabía nada, debía lidiar con la" + 
                "\nresaca y las mil y un picadas de insectos que ni siquiera conocía, pero algo era claro, estaba en peligro. No podía pensar claramente" + 
                ",\npero el olor a guajiro y a tetas de bachaquera eran suficientes para él para darse cuenta que lo que le venía era coñazo. No podía ver" + 
                "\nnada, pues el monte estaba demasiado largo y denso. Se levantó, y se dio cuenta que casualmente había un palo frente a él, así" +
                ",\nque lo tomóy se preparó para lo que viniera.");
    }
    
    
    public void Iter() {
        System.out.println("1. New Game\n2. Help\n3. Exit");
        
        do {
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
                    //Help();
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Como que estás buscando que Maduro vuelva a devaluar el bolívar");
            }
            
        }while(Iter!=3);
        
    }
        
    
    
}