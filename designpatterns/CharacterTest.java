package designpatterns;

/**
 * Created by mmcalvarez on 11/24/2016.
 */
public class CharacterTest {
    public static void main(String[] args) {
        Character c1 = new King();
        Character c2 = new Queen();
        Character c3 = new Knight();
        Character c4 = new Troll();
        Character c5 = new King();
        Character c6 = new Queen();

        c1.setWeaponBehavior(new KnifeBehavior());
        c2.setWeaponBehavior(new BowAndArrowBehavior());
        c3.setWeaponBehavior(new SwordBehavior());
        c4.setWeaponBehavior(new AxeBehavior());
        c5.setWeaponBehavior(new BowAndArrowBehavior());
        c6.setWeaponBehavior(new AxeBehavior());

        c1.fight();
        c2.fight();
        c3.fight();
        c4.fight();
        c5.fight();
        c6.fight();
    }
}
