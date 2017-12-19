package by.spr.lesson4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		// Найти максимальный элемент для каждого столбца матриц размерностью NxN.

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter number of rows:");
		int rownb = input.nextInt();
		System.out.println("\nEnter number of columns:");
		int colnb = input.nextInt();

		// Пользователь задает размерность массива и заполняет его

		int x[][] = new int[rownb][colnb];

		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter elements for the " + (i + 1)
					+ " row (use integer values and press enter after each element)");
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = input.nextInt();
			}
		}

		System.out.println("\n Source array (" + rownb + "х" + colnb + "):\n");

		for (int i = 0; i < rownb; i++) {
			for (int j = 0; j < colnb; j++) {
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}

		int maxelcol[] = new int[colnb];

		for (int j = 0; j < colnb; j++) {
			maxelcol[j] = x[0][j];
			for (int i = 0; i < rownb; i++) {
				if (x[i][j] > maxelcol[j]) {
					maxelcol[j] = x[i][j];
				}
			}
		}

		System.out.println();

		for (int i = 0; i < maxelcol.length; i++) {
			System.out.println("Max element in " + (i + 1) + " column = " + maxelcol[i]);

		}

	}

}
