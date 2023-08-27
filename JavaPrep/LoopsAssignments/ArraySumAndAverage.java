package loopsAssignment;

import java.util.Scanner;

public class ArraySumAndAverage 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];

		System.out.println("Enter five integers:");

		for (int i = 0; i < 5; i++) 
		{
		     System.out.print("Enter number " + (i + 1) + ": ");
		     numbers[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int num : numbers) 
		{
		    sum += num;
		}

		double average = (double) sum / numbers.length;

		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);

		scanner.close();

	}

}
