package loopsAssignment;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10];

	        System.out.println("Enter ten integers:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        int smallest = numbers[0];
	        int largest = numbers[0];

	        for (int i = 1; i < 10; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        System.out.println("Smallest number: " + smallest);
	        System.out.println("Largest number: " + largest);

	        scanner.close();
	}

}
