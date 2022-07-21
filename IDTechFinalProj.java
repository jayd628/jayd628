import java.util.Scanner;

public class FinalStuff {

	public static void main(String[] args) {
		int playerLevel =0;
		
		double playerHealth = 100.0;
		int playerStrength= 15;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome Escape Death Row Records!");
		System.out.println("You are a studio producer called Dr. Dre");
		System.out.println("Your stuck in a very violent record company called Death Row and your mission is to get out");

		System.out.println("1. GET OUT");
		System.out.println("2. Stay and wait to die");

		int playerChoice;
		playerChoice=userInput.nextInt();
		if(playerChoice==1) {
			System.out.println("Congrates you just leveled up and now have records as weapons!");
			playerLevel++;
			System.out.println("You run down the hall and find some power strengthening milk");

			System.out.println("1. Drink it!");
			System.out.println("2. Don't drink it");


			playerChoice=userInput.nextInt();
			if(playerChoice==1) {
				System.out.println("You got a power up and now have twice the strength!");
				playerStrength*= 2;;

			}
			else {
				System.out.println("Keep walking along");
			}
			System.out.println("You come across some guards who have strong lower body strenth and stamina");


			System.out.println("1. Kick them in the shins");
			System.out.println("2. Punch them in the face");
			System.out.println("3. Karate chop their feet");

			playerChoice=userInput.nextInt();
			if(playerChoice==2) {
				System.out.println("You beat the guards");
			}
			else{

				System.out.println("The guards killed you. Game Over!");
			}
			System.out.println("You see the very big evil owner of Death Row Records: Suge Knight standing in your way");

			System.out.println("You must fight him to get out");
			System.out.println("1. Punch him");
			System.out.println("2. Throw your records at him");

			playerChoice=userInput.nextInt();
			if(playerChoice==2) {
				System.out.println("You beat Suge Knight and now smoke some weed(just a joke)! You win!");
			}
			else {
				System.out.println("Suge beats you! Game Over!");
			}
		}

		else {
			System.out.println("You die! Game Over!");
		}		

	}
}
