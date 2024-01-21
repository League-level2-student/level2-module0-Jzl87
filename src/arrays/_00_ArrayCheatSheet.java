package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] firstArray = { "hola", "shalom", "hello", "Guten tag", "bonjour" };
		// 2. print the third element in the array
		System.out.println(firstArray[3]);
		// 3. set the third element to a different value
		firstArray[3] = "Konichiwa";
		// 4. print the third element again
		System.out.println(firstArray[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int x = 0; x < firstArray.length; x++) {
			System.out.println(firstArray[x]);
		}

		// 6. make an array of 50 integers
		int[] integers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();

		for (int x = 0; x < integers.length; x++) {
			integers[x] = ran.nextInt();
		}

		int smallestInt = Integer.MAX_VALUE;
		// 8. without printing the entire array, print only the smallest number in the
		// array
		for (int x = 0; x < integers.length; x++) {

			if (smallestInt > integers[x]) {
				smallestInt = integers[x];
			}
		}

		System.out.println(smallestInt);
		// 9 print the entire array to see if step 8 was correct
		for (int x = 0; x < integers.length; x++) {

			System.out.println(integers[x]);
		}
		// 10. print the largest number in the array.
		int largestInt = Integer.MAX_VALUE;
		
		for (int x = 0; x < integers.length; x++) {

			if (largestInt < integers[x]) {
				largestInt = integers[x];
			}
		}
		System.out.println(largestInt);
	}
}
