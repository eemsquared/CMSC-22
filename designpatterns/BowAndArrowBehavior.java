package designpatterns;

/**
 * Created by mmcalvarez on 11/24/2016.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Thwaaak... Thud!");
    }
}
