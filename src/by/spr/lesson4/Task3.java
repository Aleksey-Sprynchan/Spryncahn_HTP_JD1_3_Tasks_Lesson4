package by.spr.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// Дана матрица (двумерный массив). Поменять местами две любые ее строки.
		// Решение
		// Пусть строки, которые требуется поменять местами задаются пользователем при
		// выполнении программы.

		int x[][] = { { 18, 11, 5, 4, 11 }, { 18, 1, 6, 7, 2 }, { 2, 14, 14, 10, 12 }, { 13, 5, 11, 19, 19 },
				{ 6, 6, 13, 13, 16 }, { 0, 17, 14, 6, 0 }, { 14, 0, 2, 11, 7 } };

		System.out.println(" Source array (7 х 5): \n");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println("\nEnter first row number:");
		Scanner input = new Scanner(System.in);
		int row1 = input.nextInt() - 1;
		System.out.println("\nEnter second row number:");
		int row2 = input.nextInt() - 1;
		System.out.println("\nWe swap elements in rows " + (row1 + 1) + " and " + (row2 + 1) + ":\n");

		int temp = 0;
		for (int i = 0; i < x[0].length; i++) {
			temp = x[row1][i];
			x[row1][i] = x[row2][i];
			x[row2][i] = temp;
		}

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}

	}

}
