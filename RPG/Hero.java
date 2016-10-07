package rpg;

public abstract class Hero extends RPGCharacter{
	  private int level;
	  private int attack;
	  private int specialAttack;
	  private int armor;
	  

	    public Hero(String name, int hp, int level, int specialAttack, int attack, int armor) {
	        super(name, hp);
	        this.level = level;
	        this.attack = attack;
	        this.specialAttack = specialAttack;
	        this.armor = armor;
	    }
	    
	    public int attack(){
	    	return 0;
	    }


	    // getters and setters
	    public int getLevel() {
	        return level;
	    }

	    public void setLevel(int level) {
	        this.level = level;
	    }
	    
	    public int getArmor(){
	    	return armor;
	    }
	    
	    public int getAttack(){
	    	return attack;
	    }
	    
	    public int getSpecialAttack(){
	    	return specialAttack;
	    }

}
