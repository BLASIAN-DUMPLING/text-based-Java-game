//package package1;

public class Katana extends SClassWeapon {
	//variable
	private int electricDam;
	
	//constructor
	public Katana(String name, int damage, int electricDam) {
		super(name, damage);
		this.electricDam = electricDam;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It has additional electric damage of up to + " + this.electricDam + " .";
	}
	//getter-setter
	public int getElectricDam() {
		return this.electricDam;
	}
	
	public void setElectricDam(int electricDam) {
		this.electricDam = electricDam;
	}
	
	}

