
public class Zombie extends Enemy implements IZombie{

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
            setHealthPoints(getHealthPointsRemaining() + 70);
            System.out.println("Zombie regenerated 10 HP!");
        }
    }


    public void attack() {
        System.out.println("Zombie attacks for " +
                getAttackDamage() + " damage");
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck and sticks arms out");
    }
}
