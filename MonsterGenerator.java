import java.util.Random;
public class MonsterGenerator {

	public static void main(String[] args) {
		String[] monsters= { "Ghost", "Goblin","Ghoul", "Witch", "Warlock", "Vampire", "Zombie" };
		Random generator = new Random();
		int monsterIndex = generator.nextInt(monsters.length);
		String monster;
		monster = monsters[monsterIndex];
		System.out.println("A "+ monster + " appears!");
		monsters[0]="Ghost";
		monsters[1]="Goblin";
		monsters[2]="Ghoul";
		monsters[3]="Witch";
		monsters[4]="Warlock";
		monsters[5]="Vampire";
		monsters[6]="Zombie";
		System.out.println(monsters[0]);
		System.out.println(monsters[1]);
		System.out.println(monsters[2]);
		System.out.println(monsters[3]);
		System.out.println(monsters[4]);
		System.out.println(monsters[5]);
		System.out.println(monsters[6]);
		
		System.out.println("There are "+ monsters.length + " possible monsters");
		System.out.println("The last element: "+ monsters[monsters.length-1]);
	}

}
