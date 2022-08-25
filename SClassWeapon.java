//package package1;

public class SClassWeapon {
	//variables
	private String name;
	private int damage;
	
	//constructor
	public SClassWeapon() {
		System.out.println("Today you have chosen violence and unsheathed your weapon!");
	}
	public SClassWeapon(String name,int damage) {
		this.name = name;
		this.damage = damage;
	}
	
	
	//getters
	
	@Override
	public String toString() {
		return "Today You have chosen violence. Your weapon is " + this.name + " and the maximum damage amount is " + this.damage
+ " .";	}
	
	public String getName() {
		return this.name;
	}
	public int getDamage() {
		return this.damage;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
