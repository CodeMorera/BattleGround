
public class Zombie extends Enemy{

    public Zombie ( int healthPoints, int attackDamage){
        super( healthPoints, attackDamage);
    }
    @Override
    public void talk(){
        System.out.println("*Grumbling...*");
    }
    public void spreadDiseas(){
        System.out.println("The zombie is trying to spread infection");
    }
}
