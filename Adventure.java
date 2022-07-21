import java.util.Scanner;
import java.util.Random;
public class Adventure {

	public static void main(String[] args) {
		Random randomGenerator=new Random();
		// TODO Auto-generated method stub
		int playerLevel= 1;
		String playerName = "Mikey";
		double playerHealth= 10.0;
		Scanner userInput= new Scanner(System.in);
		System.out.println("What is your character's name?");
		playerName=userInput.nextLine();
		System.out.println("Welcome " + playerName + '!');
		System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
		System.out.println("1. Enter the Cave of Wonders");
		System.out.println("2. Run away to the safety of your warm bed");
		int playerChoice;
		playerChoice=userInput.nextInt();
		if(playerChoice==1) {
			//The player enters the cave
			System.out.println("You made it to the entrance of the cave.");
			playerLevel++;
			System.out.println("Your bravery has rewarded you! Congratulations, you are now level "+ playerLevel);
			
			//Trap is triggered
			System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
			System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
			int rockDamage;
			rockDamage =randomGenerator.nextInt(5);
			playerHealth -= rockDamage;
			System.out.println("The rock slide hits you for " + rockDamage + "!");
			System.out.println("You have "+ playerHealth+ " health remaining.");
			
			//The player finds a chest
			System.out.println("You pick yourself off the cave floor and brush the dust off your clothes.");
			System.out.println("The cave wall begin to close in until you manage to get through an opening into a large natural cavern.");
			System.out.println("In front of you is chest full of treasure.");
			
			boolean hasSword = false;
			System.out.println("1. Open the chest.");
			System.out.println("2. Ignore the chest. Obvious trap is obvious.");
			playerChoice= userInput.nextInt();
			
			if(playerChoice==1) {
				System.out.println("Uneasy after your close encounter with death, you slowly open the chest to reveal a magical sword!");
				hasSword=true;				
			}
			System.out.println("You leave the cavern carrying the chest and continue on your journey");
			System.out.println("As you move forward you smell the stench of danger and hear loud snoring.");
			System.out.println("Looking about the cave, at one corner you see huge monsterous dragon sleepping not to far from you!");
			System.out.println("With logical thinking you figure you must leave.");
			System.out.println("Sneaking away slowly you slip on rock which hits the cave wall. The dragon suddenly awakens!");
			
			System.out.println("1. Fight the Dragon.");
			System.out.println("2. Run for your life.");
			playerChoice=userInput.nextInt();
			if(playerChoice==1) {
				//The player fights the dragon
				System.out.println("You get a couragous feeling running in your blood and the rush of adrenaline as you charge towards the dragon!");
				if (hasSword) {
					System.out.println("You raise the magic sword and plunge it into the dragon's heart slaying the creature");
				}
				else {
					System.out.println("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!");
					System.exit(0);
				}
		    }else {
		    	//The player flees
		    	System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and goes back to sleep.");
		    }
			userInput.close();
		} else {
			//The player runs away
			System.out.println(playerName+ " runs home and goes to sleep.");
			System.exit(0);
		}
	}

}
