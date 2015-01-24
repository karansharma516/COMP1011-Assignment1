/**
 * 
 */

/**
 * @author karan
 *
 */
public class Hero {

	private int strength;
	private int speed;
	private int health;
	public String name;
	
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 +1);
		this.speed = (int)(Math.random() * 100 +1);
		this.health = (int)(Math.random()*100 +1);
	}
	
	public void fight(){
          if(hitAttempt()==true){
        	  int hit = hitDamage();
        	  System.out.println(this.name + " did damage");
        }
          else{
        	  System.out.println(this.name + " missed the attack");
          }
	}
	
	
	private boolean hitAttempt(){
		
		if(Math.random() <= 0.20){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	private int hitDamage(){
	
	   int damage = (strength) * (int) (Math.random()*6 + 1);
	   return damage;
	}
	
	
	public void show() {
        System.out.println("Hero: " + name + "\nstrength: " + strength + "\nspeed: " + speed + "\nhealth: " +
        health + "\n**********************\n");
    }
}
