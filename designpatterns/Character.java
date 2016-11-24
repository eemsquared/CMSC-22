package designpatterns;

/**
 * Created by mmcalvarez on 11/24/2016.
 */
public abstract class Character {
    private WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    public void fight(){
        weapon.useWeapon();
    }
}
