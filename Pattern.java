//nested for loop example 
class Pattern
{
	public static void main(String args[])
	{
		int i, j;
		//outer loop
		for(i=1;i<=3;i++)
		{
			//inner loop
			for(j=1;j<=i;j++)
			{
				System.out.print(j);	
			}//end inner
			System.out.println();//prints the output on the next line
			
		}//end outer
	}
}