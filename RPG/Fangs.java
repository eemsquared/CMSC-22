package rpg;

public class Fangs extends Hero{
	// because of sword
    /*private static final int BASE_ATTACK = 15;
    
    has special attribute of replenishing blood;
    
    // because of armor
    private static final int ARMOR = 0;
    
    private static final int LEVEL = 5;
    
    private static final int Hp = 100;*/

    public Fangs(String name) {
        super(name, 100, 5, 0, 15, 15);
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
