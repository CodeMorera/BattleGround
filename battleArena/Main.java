public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(150, 10);
        Ogre ogre = new Ogre(500,50);
        Battle(zombie);
        Battle(ogre);
    }


    public static void Battle(Enemy e){
        e.talk();
        e.attack();
    }
}