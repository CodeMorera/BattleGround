public class Ogre extends Enemy implements IOgre{

    public Ogre(int healthPoints, int attackDamage){
        super(healthPoints,attackDamage);
    }

    @Override
    public void talk(){
        System.out.println("Ogre is slamming hands all around");
    }

    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .20; //20%
        if(didSpecialAttackWork){
        setAttackDamage(getAttackDamage() + 4);
            System.out.println("Ogre attack increase by 4");
        }
    }
    public void attack(){
        System.out.println("Ogre attacks for "+
                getAttackDamage() + " damage");
    }

    @Override
    public void stareDown(){
        System.out.println("Ogre's eyes stare down opponent and it drops down to all four limbs.");
    }
}
