package com.company;

public class Main {

    public static void main(String[] args) {
	    Hero war = new Hero(200, 25, "Phisical");
        Hero medic = new Hero(230, "Medic");
        Boss boss = new Boss();

        boss.setBossHealth(500);
        boss.setBossesDamage(50);
        boss.setBossesSuper("magic");

        System.out.println(boss.getBossHealth()+ " " +boss.getBossesDamage()+" " +boss.getBossesSuper());

    }
}
