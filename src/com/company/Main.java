package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
	    HeroClass[] heroes = {magic,medic,warrior};
        for (HeroClass heroClass:heroes) {
            heroClass.applySuperAbility("");
        }


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
