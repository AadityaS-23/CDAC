package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			String pathname = "Sample.txt";
			File file = new File(pathname);
			Scanner sc = new Scanner(file);
			int number = sc.nextInt();
			System.out.println("Number	:	"+number);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
		int number = sc.nextInt();
		System.out.println("Number	:	"+number);
	}
}
