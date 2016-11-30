public class twoDArrayPracticeProblems
{


	public static void main(String[] args)
	{
		
		print2DArray(createArray(4));
	
	}
	/**
	* 
	* 
	*
	*
	*/
	
	public static int[][] createArray(int n)
	{
	
		int [][] arr1 = new int[n][n]; //creating a 2D int array that is 4 x 4
		int num = 1;
		for(int k = 0; k < arr1.length; k++)
		{
			for(int p = 0; p < arr1[k].length; p ++)
			{
				arr1[k][p] = num;
				num++;
			}
		}
			

	
		return arr1;
	
	}
	
	public static void print2DArray(int [][] arr)
	{
		for(int y = 0; y < arr[0].length * 2 + 5; y ++)
			System.out.print("-");
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("|");
			for(int j = 0; j < arr[i].length; j++)
			{
				for (int o = 0; o < numDigits(arr.length * arr.length) - numDigits(arr[i][j]); o ++)
				{
					
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + "|");
					
				
			}
			System.out.println();
			for(int y = 0; y < arr[i].length * 2 + 5; y ++)
				System.out.print("-");
			System.out.println();
		}
	
		
	}

	

	public static int numDigits(int n)
	{
		int spaces = 1;
		while (n > 9)
		{
		
			n = n / 10;
			spaces ++;
		}
		return spaces;
		
	}
	
	public static int[][] staircase2D(int n)
	{
		int[][] arr = new int[n][];
		for (int i = 0; i < n; i++)
			arr[i] = new int[i+1];
		return arr;
	
	}

}