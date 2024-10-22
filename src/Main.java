public class Main {
    public static void main(String[] args) {
        Weapon WEAPON1 = new Weapon(Weapontype.RIFLE, "AK-47");
        Weapon weapon2 = new Weapon(Weapontype.SHOTGUN, "Nova");
        Weapon weapon3 = new Weapon(Weapontype.PISTOL, "Makarov");


        Boss boss = new Boss(700, 50, WEAPON1);
        System.out.println("Boss info: \n" + boss.printInfo());

        Skeleton skeleton1 = new Skeleton(100, 20, weapon2, 10);
        Skeleton skeleton2 = new Skeleton(105, 25, weapon3, 15);

        System.out.println("Skeleton1 info: \n" + skeleton1.printInfo());
        System.out.println("Skeleton2 info: \n" + skeleton2.printInfo());
    }
}