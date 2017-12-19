package by.spr.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {

	public static void main(String[] args) {

		// Task 1
		// Все элементы массива поделить на значение наибольшего элемента этого массива.
		// Пример выполнения программы:
		// Исходный массив: 327 381 891 918 212 848 770 363 416 736
		// Максимум: 918
		// Частные: 0.36 0.42 0.97 1.00 0.23 0.92 0.84 0.40 0.45 0.80

		int x[] = new int[10];
		x[0] = 327;
		x[1] = 381;
		x[2] = 891;
		x[3] = 918;
		x[4] = 212;
		x[5] = 848;
		x[6] = 770;
		x[7] = 363;
		x[8] = 416;
		x[9] = 736;

		System.out.println(" Source array: \n");

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}

		}

		double maxelement = 0;

		for (int i = 0; i < x.length; i++) {
			if (maxelement < x[i]) {
				maxelement = x[i];

			}
		}

		System.out.println("\n");
		System.out.println("Max element = " + maxelement);

		System.out.println("\n New array (x[]/maxelement): \n");

		double y[] = new double[x.length];

		// double d;

		for (int i = 0; i < x.length; i++) {
			y[i] = x[i] / maxelement;
			// d = y[i]*100;
			// int a = (int) Math.round(d);
			// d = (double)a/ 100;
			// System.out.println(d);

			System.out.print(new BigDecimal(y[i]).setScale(2, RoundingMode.HALF_UP).floatValue() + "\t");
		}

	}
}
