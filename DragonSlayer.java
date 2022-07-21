public class DragonSlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playersStrength = 5;
		int dragonsHP =35;
		boolean hasSword=true;
		if (playersStrength>dragonsHP) {
			System.out.println("You defeated the dragon!");
		}
		else if (hasSword) { 
			System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");
	   }
	   else  {
			System.out.println("The dragon defeated you!");
		}
	}
}
