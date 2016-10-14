/**
* This program recursively prints numbers
* 0 through the inputted number.
* @author Matt Keller
* @version 1.0
*/

public class CountDown
{

	public static void main(String[] args)
	{
	
	printNum(5);
	
	
	
	
	
	
	
	
	
	
	}

	/** 
	* Contains the method that prints
	* the numbers 0 through n.
	* @param one integer called n
	*/
	public static void printNum (int n)
	{
		if (n == 0)
		{
			System.out.println(n);
			return;
		}
		printNum(n-1);
		System.out.println(n);
	
	
	
	
	
	
	
	}














}