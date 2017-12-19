package by.spr.lesson4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		// В двумерном массиве целых чисел определить, сколько раз в нем встречается
		// элемент со значением X.

		int x[][] = { { 18, 11, 5, 4, 11 }, { 18, 1, 6, 18, 2 }, { 2, 14, 18, 10, 12 }, { 13, 5, 11, 19, 19 },
				{ 6, 6, 13, 13, 16 }, { 0, 17, 18, 6, 0 }, { 14, 0, 2, 11, 18 } };

		System.out.println(" Source array (7 х 5): \n");

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}

		Scanner input = new Scanner(System.in);
		System.out.println("\n Enter one element from the source array:");

		int element = input.nextInt();
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				if (x[i][j] == element) {
					count++;
				}

			}
		}

		System.out.println("\nThere are " + count + " element(s) in the source array = " + element);

	}

}
