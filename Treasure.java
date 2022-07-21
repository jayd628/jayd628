import java.util.Random;
public class Treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int gold;
		gold=generator.nextInt(5);
		System.out.println("You open the chest to find "+ gold + " gold pieces!");
	}

}
