import java.util.Scanner;
public class TheGuard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();
        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();
         
        if(playerClass==1&& playerChoice==1) {
        	System.out.println("You use your warrior skills and uppercut the guard in the face");
        }
        else if(playerClass==2&& playerChoice==2) {
        	System.out.println("Take the guard's wallet out of his back pocket when he's not looking. He doesn't notice his wallet is gone for days.");
        }
        else if(playerClass==3&& playerChoice==3) {
        	System.out.println("Generate a fireball and throw it at the guard. He is slightly on fire.");
        }
        else if((playerClass==2 || playerClass==3) && playerChoice==4) {
        	System.out.println("Convince the guard into leaving.");
        }
        else if((playerClass==1 || playerChoice==3) && playerChoice ==5) {
        	System.out.println("You intimidate the guard.");
        }
        else if(!(playerClass==3) && playerChoice==6) {
        	System.out.println("You bond with the guard over how much magic sucks.");
        }
        else {
        	System.out.println("The guard punches you and you fail.");
        }
        userInput.close();
	}

}
