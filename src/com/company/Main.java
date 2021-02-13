package com.company;

public class Main {

    public static void main(String[] args) {
	    Hero war = new Hero();
	    war.setHealth(200);
        Hero medic = new Hero();
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setType("auto");
        weapon.setName("m416");

        boss.setHealth(500);
        boss.setDamage(50);
        boss.setSuperType("magic");
        boss.setWeapon(weapon);


        System.out.println(boss.getHealth()+ " " +boss.getDamage()+" " +boss.getSuperType()
                + " " + boss.getWeapon().getType() + " " + boss.getWeapon().getName());

    }
}
