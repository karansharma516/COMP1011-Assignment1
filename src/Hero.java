
/**
 * @author Karan Sharma(200275053)
 * @Version 1.2(January 29, 2015)
 * @Description: makes the Hero class which includes Hero Abilities
 * and displays the hero abilities
 *
 */
public class Hero {

	// PRIVATE PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	
	
	// PUBLIC PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * initiates the class and call the generateAbilities Method
	 * @param name get the name of the hero
	 */
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	
	
	// PRIVATE METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * This method generate ability numbers of the Hero's properties
	 */
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 +1);
		this.speed = (int)(Math.random() * 100 +1);
		this.health = (int)(Math.random()*100 +1);
	}
	
	
	/**
	 * This method randomly determine if hero hit or not
	 * @return true if hero hit, otherwise false
	 */
    private boolean hitAttempt(){
		
		if(Math.random() <= 0.20){
			return true;
		}
		else{
			return false;
		}
	}
	
	
    /**
     * This method calculates the damage the Hero causes to the	target on a	hit.
     * The damage will be calculated by	multiplying the	Hero’s strength	property 
     * by a number between 1 and 6.
     * @return the value of damage
     */
	private int hitDamage(){
	
	   int damage = (strength) * (int) (Math.random()*6 + 1);
	   return damage;
	}
	
	
	// PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++++++++++++++
		
	/**
	 * This method calls the hitAttempt method to check hitAttempt is true
	 * If true it will call the the hitDamage method
	 */
	public void fight(){
		
	  if(hitAttempt()==true){
		      System.out.println(this.name + " hit:");
	      	  System.out.println("damaged is " + hitDamage());
	      }
	    else{
	      	  System.out.println( this.name + " missed the hit");
	          }
		}
	
	
	/**
	 * This method prints the abilities of the Hero
	 */
	public void show() {
        System.out.println("Hero: " + name +  "\nstrength: "+ strength +  "\nspeed: " + speed + "\nhealth: " +
        health + "\n**********************\n");
    }
}
