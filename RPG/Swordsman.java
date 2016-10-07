package rpg;

public class Swordsman extends Hero{
	// because of sword
    /*private static final int BASE_ATTACK = 5;
    
    private static final int SPECIAL_ATTACK = 10; //double the base attack
    // because of armor
    private static final int ARMOR = 10;
    
    private static final int LEVEL = 5 ;
    
    private static final int Hp = 100;
*/
    public Swordsman(String name) {
        super(name, 100, 5, 10, 5, 10);
    }

    public int attack() {
        return super.getAttack() + getLevel();
    }
    
    public int specialAttack(){
    	return super.getSpecialAttack() + getLevel();
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        damage -= super.getArmor();
        // set new hp
        return super.takeDamage(damage);
    }

}
