package classConstr;

import java.util.Scanner;

public class Const {
	private int[] arr1; // 1D array declared (field)

	public Const(int size) { // const to instantiate the arr
		arr1 = new int[size]; // instantiate with given size
	}

	// accp R
	private void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter " + arr1.length + " numbers : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt(); // store i/p in arr
		}

	}

	// print
	private void printRecord() {
		System.out.println("Array Elements : ");
		for (int num : arr1) {
			System.out.println(num + " "); // prnts each elements
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Const c = new Const(5); // instance created with 5 elem arr
		c.acceptRecord(); // accept user i/p
		c.printRecord(); // print arr elems

	}
}
