package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Dialog {
    
    public static void help() {
        System.out.println("Hola");
    }
    
    
    public static void intro() throws InterruptedException {
        System.out.println("Este era un día lluvioso en Delta Amacuro. Luis1, un estudiante, acababa de despertar de entre el medio del monte." + 
                "\nÉl no tenía idea, estaba muy confundido, ya que no podía recordar nada, pero francamente, se había levantado en el medio de la nada" + 
                "\ndespués de perder la conciencia en senda rumba después de consumir Preveral con Ginebra. Él no sabía nada, debía lidiar con la" + 
                "\nresaca y las mil y un picadas de insectos que ni siquiera conocía, pero algo era claro, estaba en peligro. No podía pensar claramente" + 
                ",\npero el olor a guajiro y a tetas de bachaquera eran suficientes para él para darse cuenta que lo que le venía era coñazo. No podía ver" + 
                "\nnada, pues el monte estaba demasiado largo y denso. Se levantó, y se dio cuenta que casualmente había un palo frente a él, así" +
                ",\nque lo tomó y se preparó para lo que viniera.\n");
        Thread.sleep(2000);
    }
    
}