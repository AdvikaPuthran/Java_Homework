//factorial program using for loop
import java.util.Scanner;//import scanner class


class Factorial
{
	public static void main(String args[])
	{
		int i, no, fact=1; //declaring and initializing the variables
		Scanner sc=new Scanner(System.in); //object of Scanner class

		System.out.println("Enter a no."); //taking user input
		no=sc.nextInt(); //reads the int value from the user

		//for loop
		for(i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial="+fact); //printing the result
	}
}
		