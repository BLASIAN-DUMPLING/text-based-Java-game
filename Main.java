//package package1;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
//weapons
		Dagger dagger = new Dagger("Needles", 15, 5);
				
		Katana katana = new Katana("Electra", 25, 10);
		
// monsters 
		String[] monsters = {"Demogorgon", "Demodog", "Demobat", "Mindflayer"};
		int maxMonHealth = 200;
		int monsterAttDam = 20;
		
//player 
		Player player = new Player();
		player.health = 250;
		player.healPotNum = 3;
		player.amtHealPot = 30;
		player.attDam = 35;
		
		int healPotDrop = 50;	

		player.escape = true;
		
		System.out.println("------------------------------------------");	
		
		System.out.println ("You have entered the Upside Down Dungeon! You must save Hawkins and its residents by defeating the Monster!");
		
		Game:
			while(true) {
			    System.out.println("------------------------------------------");   

			    int monstHealth = rand.nextInt(maxMonHealth); 
			    String monster = monsters[rand.nextInt(monsters.length)];
			System.out.println("\t# " + monster + " has appeared! #\n");
			player.printInfo();
			while(monstHealth > 0) {
			    System.out.println("\t" + monster + "'s HP: " + monstHealth);
			    System.out.println("\n\tWhat would you like to do?");
			    System.out.println("\t1. Attack?");
			    System.out.println("\t2. Drink health potion?");
			    System.out.println("\t3. Run!?!");
			    String input = in.nextLine();
			    if(input.equals("1")){
			    	System.out.println("\n\tWhich weapon do you choose?");
			    	System.out.println("\t d for dagger ?");
			    	System.out.println("\t k for katana ?");
			    	String input2 = in.nextLine(); 
			    	
			    	String letter = input2;
			    	switch(letter) {
			    	case "d":
			    		System.out.println("You chose the dagger!\n");
			    		break;
			    	case "k":
			    		System.out.println("You chose the katana!\n");
			    		break;
			    		default:
			    			System.out.println("Oh, you think don't need a weapon?\n");
			    			break;
			    	}
			    	
			    	
			    	if(input2.equals("d")) {
			    		System.out.println(dagger);}
			    	else if(input2.equals("k")) {
			    		System.out.println(katana);}
			    int damageDealt = rand.nextInt(player.attDam);
;
			    int damageTaken = rand.nextInt(monsterAttDam);

			    monstHealth -= damageDealt;
			    player.health -= damageTaken;

			    System.out.println("\t> You slashed the " + monster + " for " + damageDealt + " damage!");
			    System.out.println("\t> You took " + damageTaken + " in damage! You have " + player.health + " left in hp!");

			    if(player.health < 1 ) {
			        System.out.println("\t> You have taken too much damage. Say goodbye to Hawkins!");
			        break;
			    }
			    }
			    else if(input.equals("2")){
			    if(player.healPotNum > 0){
			        player.health += player.amtHealPot;
			        player.healPotNum--;
			        System.out.println("\t> You used an healing potion, raising your health by " + player.amtHealPot + " !"  + "\n\t> You now have " + player.health + " HP and You have " + player.healPotNum + " potions left. \n");
			    }else{
			        System.out.println("\t> You are out of health potions! Kill the monster for a chance to receive one! \n");
			    }
			    }
			    else if(input.equals("3")){
			    System.out.println("\tYou ran from the " + monster + " !");
			    continue Game;
			    }
			    else {
			    System.out.println("\t Oooops! You have entered an INVALID COMMAND! Try again");
			    }


			    }
			    if (player.health < 1) {
			     System.out.println("You have died and Hawkins has been destroyed! Try Again!");
			     break;
			    }

			    System.out.println("------------------------------------------");   
			    System.out.println(" # " + monster + " has been destroyed! # ");
			    System.out.println(" # You have " + player.health + " HP left! #" );
			    if(rand.nextInt() < healPotDrop){
			        player.healPotNum++;
			        System.out.println(" # The " + monster + " dropped a health potion! You have " + player.healPotNum + " health potions!");
			    }else{
			    System.out.println(" # The " + monster + " dropped GOLD!!!!");
			    }
			    System.out.println("------------------------------------------");   
			    System.out.println("Would you like to play again?");
			    System.out.println("a. Yes");
			    System.out.println("b. No");

			    String input = in.nextLine();

			    while(!input.equals("a") && !input.equals("b")){
			        System.out.println("\t Oooops! You have entered an INVALID COMMAND! Try again");
			        input = in.nextLine();
			    }
			    if(input.equals("a")) {
			        System.out.println("Uh-Oh another monster has appeared!");
			      continue Game;
			        }
			        else {
			            System.out.println("You safely exited the Upside Down Dungeon, saving Hawkins!");
			            break;
			          			        }

			    
}
		System.out.println("#### Thank you for playing! ####");
	}
	
}



	
