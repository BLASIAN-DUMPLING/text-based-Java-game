//package package1;

public class Dagger extends SClassWeapon {
	//variable
	private int poisonDam;
	
	//constructor
	public Dagger(String name, int damage, int poisonDam) {
		super(name, damage);
		this.poisonDam = poisonDam;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It has additional poison damage of up to + " + this.poisonDam + " .";
	}
	
	//getter-setter
	public int getPoisonDam() {
		return this.poisonDam;
	}
	
	public void setPoisonDam(int poisonDam) {
		this.poisonDam = poisonDam;
	}
}
