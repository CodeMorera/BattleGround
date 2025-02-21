package thebattleground.individualenemy;

import thebattleground.enemies.Enemy;

public class Zombie extends Enemy implements IZombie {

    public Zombie ( int healthPoints, int attackDamage){
        super( healthPoints, attackDamage);
    }
    @Override
    public void talk(){
        System.out.println("*Grumbling...*");
    }


    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .50;
        if(didSpecialAttackWork){
            int currentHealth = getHealthPointsRemaining();
            setHealthPointsRemaining(currentHealth + 50);
            System.out.println("enemies.individualenemy.Zombie regenerated 70 HP!");
        }
        else{
            System.out.println("enemies.individualenemy.Zombie growls!");
        }
    }


    public void attack() {
        System.out.println("enemies.individualenemy.Zombie attacks for " +
                getAttackDamage() + " damage");
    }

    @Override
    public void battleStance() {
        System.out.println("enemies.individualenemy.Zombie cracks neck and sticks arms out");
    }
}
