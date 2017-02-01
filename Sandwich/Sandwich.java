import java.util.ArrayList;
public class Sandwich
{
	private String meat;
	private String cheese;
	private String bread;
	private String condiment;
	private ArrayList<String> toppings;
	private String name;
	
	//constructors
	
	/**
	* This constructor creates a default Sandwich
	* by setting the global variables equal to 
	* a standard sandwich.
	*/
	public Sandwich()
	{
		ArrayList<String> t = new ArrayList<String>();
		t.add("lettuce");
		t.add("tomato");
		meat = "turkey";
		cheese = "American Cheese";
		bread =  "white bread";
		condiment = "mayonnaise";
		toppings = t;
		name = "Turkey and Cheese";
	
	}
	
	/**
	* This method creates a sandwich
	* with the specified components in the parameters.
	* @param all the components of a sandwich
	*/
	public Sandwich(String m, String ch, String b, String c, ArrayList<String> t, String n)
	{
		meat = m;
		cheese = ch;
		bread = b;
		condiment = c;
		toppings = t;
		name = n;
	}
	
	//accessors
	/**
	* Returns the global variable meat.
	* @return the global variable meat
	*/
	public String getMeat()
	{
		return meat;
	}
	
	/**
	* Returns the global variable cheese.
	* @return the global variable cheese
	*/
	public String getCheese()
	{
		return cheese;
	}
	
	/**
	* Returns the global variable bread.
	* @return the global variable bread
	*/
	public String getBread()
	{
		return bread;
	}
	
	/**
	* Returns the global variable condiment.
	* @return the global variable condiment
	*/
	public String getCondiment()
	{
		return condiment;
	}
	
	/**
	* Returns the global variable toppings.
	* @return the global variable toppings
	*/
	public ArrayList<String> getToppings()
	{
		return toppings;
	}

	/**
	* Returns the global variable name.
	* @return the global variable name
	*/
	public String getName()
	{
		return name;
	}
	//modifiers
	/**
	* Sets the global variable meat equal 
	* to the parameter of your choice.
	* @param the designated meat
	*/
	public void setMeat(String m)
	{
		meat = m;
	}
	
	/**
	* Sets the global variable cheese equal 
	* to the parameter of your choice.
	* @param the designated cheese
	*/
	public void setCheese(String c)
	{
		cheese = c;
	}
	
	/**
	* Sets the global variable condiment equal 
	* to the parameter of your choice.
	* @param the designated condiment
	*/
	public void setCondiment(String co)
	{
		condiment= co;
	}
	
	/**
	* Sets the global variable bread equal 
	* to the parameter of your choice.
	* @param the designated bread
	*/
	public void setBread(String b)
	{
		bread = b;
	}
	
	/**
	* Sets the global variable toppings equal 
	* to the parameter of your choice.
	* @param the designated toppings
	*/
	public void setToppings(ArrayList<String> t)
	{
		toppings = t;
	}
	
	/**
	* Sets the global variable name equal 
	* to the parameter of your choice.
	* @param the designated name
	*/
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	* This method allows the sandwich to print in 
	* a human readable format with all sandwich
	* components listed
	*/
	public String toString()
	{
		return name + ": " + meat + ", " + cheese + ", " + bread + ", " + condiment + ", " + toppings;
	}

	/**
	* This method returns the price of the sandwich
	* that has been created. Each meat has a different price
	* and the rest of the sandwich costs a standard amount.
	*/
	public double getPrice()
	{
		double price = 1.99;
		if (meat.equalsIgnoreCase("turkey"))
			price += 2;
		else if (meat.equalsIgnoreCase("ham"))
			price += 1.5;
		else if (meat.equalsIgnoreCase("roast beef"))
			price += 3;
		else if (meat.equalsIgnoreCase("pastrami"))
			price += 3.5;
		else
			price += 2.5;

		return price;
	}
}