public class IfDigit
{

	public static void main(String[] args)
	{
		System.out.println(hasDigit("aaa1"));
		System.out.println(hasDigit("aaaa"));
	
	}




	/**
	* This method takes in a string and
	* returns true if there is a digit in it.
	* Returns false otherwise.
	* @param s input string @return boolean true if digit false otherwise.
	*/

	public static boolean hasDigit(String s)
	{
		int i = s.length();
		for (int j = 0; j < i; j++)
		{
			if ( (int) s.charAt(j) >= 48 &&  (int) s.charAt(j) <= 57)
				return true;
		}
		return false;
	
	
	
	
	}
	
	
	
	



}