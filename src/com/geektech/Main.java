package com.geektech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss shaoKahn = new Boss();
        shaoKahn.setHealth(200);
        shaoKahn.setDamace(20);
        shaoKahn.setDefence(" Boss defence");

        System.out.println("Здоровье босса" + " " + shaoKahn.getHealth() + " Урон босса" + " " + shaoKahn.getDamace() +
                "Защита босса" + " " + shaoKahn.getDefence());
        createHeroes();
        for (Hero name:createHeroes()) {
            System.out.println(name.getHealth() + " " + name.getDamace() + " " + name.getUltimate());

        }

        }
            

        public static Hero[] createHeroes(){
        Hero subZero = new Hero(180,10);
        Hero scorpion = new Hero(200,15);
        Hero kano = new Hero(190,10);


        Hero[] mortalKombat = {subZero,scorpion,kano};
        return mortalKombat;
        }
    }


