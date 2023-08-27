package basicAssignment;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum;
		
		System.out.println("\n Enter any 2 numbers for addition");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		sum= n1 + n2;
		
		System.out.println("\n Sum="+sum);
		
	}
}
