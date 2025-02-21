package thebattleground.enemies;

public interface IEnemy {
    void talk();
    void attack();
    int getHealthPoints();
    int getAttackDamage();
    void setAttackDamage(int attackPoints);
    int getHealthPointsRemaining();
    void setHealthPointsRemaining(int healthPointsRemaining);
    void specialAttack();
    int getID();
}
