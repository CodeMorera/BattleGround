public interface IHero {
    int getHealthPoints();
    int getHealthPointsRemaining();
    void setHealthPointsRemaining(int healthPointsRemaining);
    int getAttackDamage();
    Weapon getWeapon();
    void setWeapon(Weapon weapon);
}
