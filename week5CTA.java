package week5;

import java.util.Scanner;

public class week5CTA {
	public static int calcProduct(int[] numbers, int index) {
		if (index < 0) {
			return 1;
		}
		return numbers[index]*calcProduct(numbers, index-1);
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] numbers= new int[5];
		System.out.println("hi");
		System.out.println("Enter 5 integers: ");
		for (int i=0; i < 5l; i++) {
			System.out.println("Number" +(i+1) + ": ");
			numbers[i] = scnr.nextInt();
		}
		
		int product = calcProduct(numbers, 4);
		System.out.println("Product: " + product);
		scnr.close();
		
	}

}
