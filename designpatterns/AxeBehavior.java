package designpatterns;

/**
 * Created by mmcalvarez on 11/24/2016.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chuggg!");
    }
}
