package com.lepg.Proyecto2;


/**
 * @author Luis1
 */


public class Player {
    private double HP;
    private double dmg;
    private Bag bag;
    private boolean eff;
    private int MaxHP=60;
    
    public Player() {
        HP=MaxHP;
        dmg=5;
        bag=new Bag();
        eff=false;
    }
    
    
}