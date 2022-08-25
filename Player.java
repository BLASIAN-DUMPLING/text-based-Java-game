//package package1;

class Player {
	int health;
	int healPotNum;
	int amtHealPot;
	int attDam;
	public boolean escape;
		
	
	void printInfo() {
		System.out.println("Your HP is at " + health + " with " + healPotNum + " health potions!");
	}
}
