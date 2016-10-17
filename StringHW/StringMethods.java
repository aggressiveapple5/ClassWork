/**
* This program contains three StringMethods
* @author Matt Keller
* @version 1.0
*/
public class StringMethods
{

	public static void main(String[] args)
	{
	
	
	
		System.out.println(findString("abcdeab", "ab", 3));
		System.out.println(findString("abcdeab", "ef", 1));
		
	
	
		System.out.println(countStrings("aboabcabd", "ab"));
		System.out.println(countStrings("asdfgh", "ab"));
	
	
		System.out.println(convertItalics("The pie is good."));
		System.out.println(convertItalics("The_pie is good."));
		System.out.println(convertItalics("The_pie_is good."));
	
	
	
	
	
	
	}

	/**
	* Finds the first instance of s in line,
	* starting at the position start
	* @param o the orignal string 
	* @param s the string to find 
	* @param start the position to start searching.
	* Guaranteed to be in the string line. (precondition)
	* @return the index of the first single instance of
	* s if the string is found OR -1 if it is not found.
	*/
	public static int findString (String o, String s, int start)
	{
		String w = o.substring(start);
		return w.indexOf(s);
	
	
	
	
	
	
	}
	
	/**
	* Count the number of times instances of s appear in
	* the line.
	* @param o the original string
	* @param s the string to find.
	* @return the number of times the string appears in the line
	*/
	public static int countStrings (String o, String s)
	{
		int k = 0;
		int j = 0;
		while (o.length() > 0)
		{
			j = o.indexOf(s);
			if (j < 0)
			{
				
				return k;
			}
			else
				k ++;
				o = o.substring(j + 1);
				
				
		}
		
			
		return 0;

				
			
	
	
	
	
	
	}


	/**
	* Replace all instances of underscores in the line given by
	* line with italics tags.  There must be an even number of underscores
	* in the line, and they will be replaced by <I>, </I>, alternating.
	* @param line a string with 0 or more underscores
	* @return the line that has underscores replaced with <I> </I> tags or 
	* the original line if there are not an even number of underscores.
	*/
	public static String convertItalics (String line)
	{
	
		/**
		int k = 0;
		
		String q = line;
		int j = q.indexOf("_");
		System.out.println("q =" + q);
		while (j > 0)
		{
			j = q.indexOf("_");
			System.out.println("j = " + j);
			if (j < 0)
			{
				
				return line;
			}
			else
			{
				k ++;
				q = q.substring(j + 1);
			}
				
				
		}
		System.out.println("I am here");
		if (k % 2 == 1)
		{
			System.out.println("yo");
			return line;
		}
		else
		{
			
			int t = 0;
			String n = line;
			int g = n.length();
			int y = 0;
			while (y < g)
			{
				t = q.indexOf("_");
				System.out.println(t);
				n = n.substring(0, t - 1) + "<I>" + n.substring(t + 1, g + 1);
					
				n = n.substring(j + 1);
				y ++;
			}
		
		
		
		
		}
		return line;
		*/
	
	
	
	
	
		int inIt = line.indexOf("_");
		if (inIt < 0)
			return line;
		else
		{
			int numOfUnderscores = 0;
			String copyOfOriginal = line;
			int placementOfUnderscores = copyOfOriginal.indexOf("_");
			while (placementOfUnderscores >= 0)
			{
				placementOfUnderscores = copyOfOriginal.indexOf("_");
				numOfUnderscores ++;
				copyOfOriginal = copyOfOriginal.substring(placementOfUnderscores + 1);
				
			}
			if (numOfUnderscores % 2 == 0)
				return line;
			else
			{
				String evenCopy = line;
				while (evenCopy.indexOf("_") > -1)
				{
					int placement = evenCopy.indexOf("_");
					evenCopy = (evenCopy.substring(0, placement) + "<I>" + evenCopy.substring(placement + 1, evenCopy.length()));
				}
				
				return evenCopy;
				
			}
				
			
			
			
		}
	
	
	
	}














}