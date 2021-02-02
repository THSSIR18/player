import java.util.Scanner;
public class TestPlayer
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press a number for player one type: " + "\n" + "1 Archer" + "\n" + "2 Mage" + "\n" + "3 Warrior"+ "\n" + "4 Juggernaut");
		int type1 =sc.nextInt();
		System.out.println("Enter players name");
		String p1 =sc.next();
		System.out.println("Press a number for player two type: " + "\n" + "1 Archer" + "\n" + "2 Mage" + "\n" + "3 Warrior"+ "\n" + "4 Juggernaut");
		int type2 =sc.nextInt();
		System.out.println("Enter players name");
		String p2 =sc.next();
		
		Player P1 = new Player(p1,type1);
		Player P2 = new Player(p2,type2);
		
		System.out.println("");
		System.out.println("Class Type " + P1.getMyClass);
		System.out.println("Health " + P1.getHP);
		System.out.println("DodgePercent " + P1.getDodge);
		System.out.println("");
		System.out.println(P2 );
		
		System.out.println("");
		System.out.println("Press enter to start battle");
		
		while(P1.getHP() > 0 && P2.getHP() > 0)
		{
			int damage = P1.attack();
			P2.takeDamage(damage);
			System.out.println("");
			sc.nextLine();
			
			int damage2 = P2.attack();
			P1.takeDamage(damage2);
			System.out.println("");
			System.out.println("Press enter to return to battle");
			sc.nextLine();
		}
	}
}