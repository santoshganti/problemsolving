package algorithms.edu;

public class Insertionsort {
	// method to capture and print the array
	public static void printSequence(int input[]) {
		System.out.print("\nThe sorted sequence is:");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.print("\n");
	}

	/*
	 * ALOGRITHM FOR THIS SORT for j=2 to A.length where A is the input array
	 * key=A[j] i=j-1 while i>0 and A[i]>key A[i+1]=A[i] i=i-1 A[i+1] = key
	 */

	public static void inserstionSort(int inputarray[]) {
		System.out.print("The actual sequence is:");
		for (int i = 0; i < inputarray.length; i++) {
			System.out.print(inputarray[i] + ",");
		}
		int n = inputarray.length; // length of array
		int key;// element we are comparing
		for (int j = 2; j < n; j++) {
			key = inputarray[j];
			int i = j - 1;

			while (i > -1 && inputarray[i] > key) {
				inputarray[i + 1] = inputarray[i];
				i = i - 1;
			}
			inputarray[i + 1] = key;
		}
		printSequence(inputarray);//prints the final sequence
	}
}
