public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(70);
    boss.weapon.setWeaponName("Scorpion");
    boss.weapon.setWeaponType(WeaponType.COLD);
        System.out.println("health: " + boss.getHealth() + " damage: " + boss.getDamage() + " type: "
                + boss.weapon.getWeaponType() + " name: " + boss.weapon.getWeaponName());

        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(350);
        skeleton.setDamage(80);
        skeleton.weapon.setWeaponType(WeaponType.REVOLVER);
        skeleton.weapon.setWeaponName("OLAF");
        System.out.println("health: " + skeleton.getHealth() + " damage: " + skeleton.getDamage() + " type: "
                + skeleton.weapon.getWeaponType() + " name: " + skeleton.weapon.getWeaponName());


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(500);
        skeleton2.setDamage(100);
        skeleton2.weapon.setWeaponName("BLOOM");
        skeleton2.weapon.setWeaponType(WeaponType.SHOTGUN);
        System.out.println("health: " + skeleton2.getHealth() + " damage: " + skeleton2.getDamage() + " type: "
                + skeleton2.weapon.getWeaponType() + " name: " + skeleton2.weapon.getWeaponName());
    }


}