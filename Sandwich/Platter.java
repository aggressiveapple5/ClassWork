public class Platter
{
	private Sandwich s1;
	private Sandwich s2;
	private Sandwich s3;
	
	/**
	* The default sandwich Platter
	* constructor that calls the default
	* sandwich maker
	*/
	public Platter()
	{
		s1 = new Sandwich();
		s2 = new Sandwich();
		s3 = new Sandwich();
	
	}
	/**
	* The overloaded Platter constructor that consists
	* of 3 custom sandwiches.
	* @param three Sandwiches for the Platter
	*/
	public Platter(Sandwich a, Sandwich b, Sandwich c)
	{
		s1 = a;
		s2 = b;
		s3 = c;
	
	}
	
	

	//accessors
	
	/**
	* Returns the first Sandwich on the platter
	* by returning the global variable s1.
	* @return a Sandwich
	*/
	public Sandwich getS1()
	{
		return s1;
	}
	
	/**
	* Returns the second Sandwich on the platter
	* by returning the global variable s2.
	* @return a Sandwich
	*/
	public Sandwich getS2()
	{
		return s2;
	}
	
	/**
	* Returns the third Sandwich on the platter
	* by returning the global variable s3.
	* @return a Sandwich
	*/
	public Sandwich getS3()
	{
		return s3;
	}
	
	//modifiers
	/**
	* Sets Sandwich s1 to the desired sandwich of choice.
	* @param the Sandwich that the user wants to put on the Platter
	* in exchange for s1
	*/
	public void setS1(Sandwich a)
	{
		s1 = a;
	}
	
	/**
	* Sets Sandwich s2 to the desired sandwich of choice.
	* @param the Sandwich that the user wants to put on the Platter
	* in exchange for s2
	*/
	public void setS2(Sandwich a)
	{
		s2 = a;
	}
	
	/**
	* Sets Sandwich s3 to the desired sandwich of choice.
	* @param the Sandwich that the user wants to put on the Platter
	* in exchange for s3
	*/
	public void setS3(Sandwich a)
	{
		s3 = a;
	}
	
	/**
	* Allows the print method to be able
	* to print the Platter in a human readable
	* format by calling the Sandwich class' getName() 
	* accessor.
	* @returns the Platter in a human readable format
	*/
	public String toString()
	{
		return "Your platter contains: " + s1.getName() + ", " + s2.getName() + ", and " + s3.getName();
	}
	
	/**
	* Returns the price of the platter based
	* on the prices of all the Sandwiches in the platter.
	* Calls the Sandwich class' getPrice() accessor.
	* @return a String that is the price plus the dollar sign
	*/
	public double getPrice()
	{
		double price = s1.getPrice() + s2.getPrice() + s3.getPrice();
		return price;
	
	}
}