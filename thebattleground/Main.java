package thebattleground;

import thebattleground.enemies.Enemy;
import thebattleground.heros.weapons.Weapon;
import thebattleground.individualenemy.Ogre;
import thebattleground.individualenemy.Zombie;

public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(350, 30);
        Ogre ogre = new Ogre(500,50);



        System.out.println("There are " + Enemy.getNumberOfEnemies() + " enemies ready to fight");
        zombie.battleStance();
        ogre.stareDown();
//        Battle(zombie,ogre);

        Weapon weapon = new Weapon("Sword",50);
        Hero hero = new Hero(250,15);
        hero.setWeapon(weapon);
        hero.equipWeapon();
        heroBattle(hero,zombie);

    }
    public static void Battle(Enemy e1, Enemy e2){

        e1.talk();
        e2.talk();

        while (e1.getHealthPointsRemaining() > 0 && e2.getHealthPointsRemaining()>0){
            System.out.println("-------");
            e1.specialAttack();
            e2.specialAttack();
            System.out.println("enemies.Enemy 1: " + e1.getHealthPointsRemaining() + " HP remaining");
            System.out.println("enemies.Enemy 2: " + e2.getHealthPointsRemaining() + " HP remaining");
            e2.attack();
            e1.setHealthPointsRemaining(e1.getHealthPointsRemaining() - e2.getAttackDamage());
            e1.attack();
            e2.setHealthPointsRemaining(e2.getHealthPointsRemaining() - e1.getAttackDamage());
        }
        System.out.println("--------Final-------");
        if(e1.getHealthPointsRemaining() > 0){
            System.out.println("enemies.Enemy 1 wins!");
        }
        else{
            System.out.println("enemies.Enemy 2 wins!");
        }
    }

    public static void heroBattle(Hero hero, Enemy enemy){
        while(hero.getHealthPointsRemaining() > 0 && enemy.getHealthPointsRemaining() > 0){
            System.out.println("--------------");
            enemy.specialAttack();
            System.out.println("Hero: " + hero.getHealthPointsRemaining() + " HP left");
            System.out.println("enemies.Enemy: " + enemy.getHealthPointsRemaining() + " HP left");
            enemy.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());
            hero.attack();
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - hero.getAttackDamage());
        }
        System.out.println("-------------");
        if(hero.getHealthPointsRemaining() > 0){
            System.out.println("Hero wins!");
        }else{
            System.out.println("enemies.Enemy wins!");
        }
    }

}