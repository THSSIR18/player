import java.util.*;

public class Player	
{
	private int hitpoints;
	private int dodgePercent;
	private String classtype;
	private String name;
	
	public Player()
	{
		
	}
	
	public Player(String n,int x)
	{
		if (x == 1)	
			
			classtype= "Mage";
		if (x == 2)
		
			classtype= "Archer";
		if (x == 4)
		
			classtype= "Juggernaut";
		if (x == 3)
		
			classtype= "Warrior";
			name=n;
			setAttributes();
			
	}
	public int getRandom()
	{
		Random rand = new Random();
		int num = rand.nextInt(20) + 1 - 10;
		return num;
	}
	public void setAttributes()
	{
		setHP();
		setDodge();	
	}
	public int getHP()
	{
		return hitpoints;
	}
	public int getDodge()
	{
		return dodgePercent;
	}
	public String getMyClass()
	{
		return classtype;
	}
	public void setHP()
	{
		if (classtype.equals("Archer"))
			hitpoints = 150 + getRandom();
		if (classtype.equals("Mage"))
			hitpoints = 100 + getRandom();
		if (classtype.equals("Warrior"))
			hitpoints =200 + getRandom();
		if (classtype.equals("Juggernaut"))
			hitpoints = 300 + getRandom();
	}
	public void setDodge()
	{
		if (classtype.equals("Archer"))
		dodgePercent = 35 + getRandom();
		if (classtype.equals("Mage"))
		dodgePercent = 20 + getRandom();
		if (classtype.equals("Warrior"))
		dodgePercent =10 + getRandom();
		if (classtype.equals("Juggernaut"))
		dodgePercent = 5 + getRandom();
	}
	public int attack()
	{
		Random next = new Random();
		int number = next.nextInt(100)+1;
		if (classtype.equals("Archer"))
		{
		
			if (number <= 50)
			{
				System.out.println(name + " attacked with *QuickShot*");
				return 10;
			}
			else if(number <= 80)
			{
					System.out.println(name + " attacked with *FlamingArrow*");
				return 20;
			}
			else
			{
				System.out.println(name + " attacked with *ExplodingArrow*");
				return 40;
			}
			
		}		
		if (classtype.equals ("Mage"))
		{
		
			if (number <= 60)
			{
				System.out.println(name + " attacked with *Fireball*");
				return 20;
			}
			else if(number <= 85)
			{
					System.out.println(name + " attacked with *Ice Storm*");
				return 40;
			}
			else
			{
				System.out.println(name + " attacked with *Meteor*");
				return 60;
			}
		}
	
		if (classtype.equals ("Juggernaut"))
		{
		
		if (number <= 40)
			{
				System.out.println(name + " attacked with *Urchin Strike*");
				return 10;
			}
			else if(number <= 85)
			{
					System.out.println(name + " attacked with *Seastone Trident*");
				return 20;
			}
			else
			{
				System.out.println(name + " attacked with *Playful Trickster*");
				return 100;
			}
		}
		if (classtype.equals("Warrior"))
		{
			if (number <= 40)
			{
				System.out.println(name + " attacked with *Slash*");
				return 15;
			}
			else if(number <= 75)
			{
					System.out.println(name + " attacked with *Wind Slash*");
				return 30;
			}
			else
			{
				System.out.println(name + " attacked with *Ultra Slash*");
				return 45;
			}
		}
		return 0;
	}	
		public boolean dodge()
		{
			Random next = new Random();
			int number1 = next.nextInt(100)+1;
			if (dodgePercent > number1)
			{
			
			return true;
			}
			else
			{
			
		
			
			return false;
			}
		}
		
		public void takeDamage(int d)
		{
			if (dodge() == true)
			{
				System.out.println(name + "dodged the attack");
			}
			else
			{
				hitpoints = hitpoints - d;
				System.out.println(name + " has been hit and takes " + d + " damage ");
				System.out.println(name + " has "+ hitpoints + " left" );
			}
		}
		public String toString()
		{
			String str;
				str = (name  + "\n" + "the " + classtype + "\n" +  hitpoints + "\n" +  dodgePercent);
				return str;
		} 
}	
	

