package thebattleground.enemies;

public abstract class Enemy implements IEnemy {
    private int id;
    private int healthPointsRemaining;
    private int healthPoints;
    private int attackDamage;
    private static int numberOfEnemies;

    public Enemy(int healthPoints, int attackDamage){
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }
    @Override
    public void specialAttack(){
        System.out.println("enemies.Enemy does not have a special attack");
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }
    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }
    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    @Override
    public int getID() {
        return id;
    }

    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }
    @Override
    public void talk(){
        System.out.println( "I am a enemy, be prepared to fight!");
    }

    @Override
    public void attack(){
        System.out.println("enemies.Enemy attacks for " + attackDamage +" damage.");
    }
}
