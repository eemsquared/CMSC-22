package rpg;

public class TheQueen extends Hero{
	// because of sword
   /* private static final int BASE_ATTACK = 20;
    
    SPECIAL_ATTACK = 15;
    DEFLECT ATTACK == generated randomly;
    // because of armor
    private static final int ARMOR = 10;
    
    private static final int LEVEL = 15;
    
    private static final int Hp = 100;*/

    public TheQueen(String name) {
        super(name, 100, 15, 10, 20, 15);
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
