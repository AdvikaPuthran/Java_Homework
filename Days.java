import java.util.Scanner; //import scanner class

class Days
{
	static void days(int num)// static method
	{
		if(num==1)
		{
			System.out.println("It is Sunday");
		}
		else if(num==2)
		{
			System.out.println("It is Monday");
		}
		else if(num==3)
		{
			System.out.println("It is Tuesday");
		}
		else if(num==4)
		{
			System.out.println("It is Wednesday");
		}	
		else if(num==5)
		{
			System.out.println("It is Thursday");
		}	
		else if(num==6)
		{
			System.out.println("It is Friday");
		}	
		else if(num==7)
		{
			System.out.println("It is Saturday");
		}	
		else
		{
			System.out.println("Enter any number from 1-7 only");
		}
	}	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //object of Scanner class
		System.out.println("Enter any 	number from 1-7");//taking input from the user
		int num=sc.nextInt();//read user input

		days(num);//calling static method
	}
}