package com.geektech;

public class Hero {
    private int health;
    private int damace;
    private String ultimate;

    public Hero(int health, int damace,String ultimate){
        this.health = health;
        this.damace = damace;
        this.ultimate = ultimate;
    }
    public Hero(int health, int damace){
        this.health = health;
        this.damace = damace;
    }

    public int getHealth() {
        return health;
    }
    public int getDamace(){
        return  damace;
    }
    public String getUltimate(){
        return ultimate;
    }
}
