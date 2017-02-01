import java.util.ArrayList;
public class SandwichRunner
{
	public static void main(String[] args)
	{
	
		Sandwich s1 = new Sandwich();
		System.out.println(s1);
		System.out.println("Price: " + s1.getPrice());
		
		s1.setMeat("pastrami");
		s1.setName("Pastrami and Cheese");
		System.out.println(s1);
		System.out.println("Price: $" + s1.getPrice());
		
		Platter p1 = new Platter();
		System.out.println(p1);
	}
}