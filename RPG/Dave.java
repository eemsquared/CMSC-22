package rpg;

public class Dave extends Hero{
	// because of sword
    /*private static final int BASE_ATTACK = 15;
    
    SPECIAL_ATTAACK = 25;
    // because of armor
    private static final int ARMOR = 10;
    
    private static final int LEVEL = 10;
    
    private static final int Hp = 150;
*/
    public Dave(String name) {
        super(name, 150, 10, 10, 15, 25);
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
