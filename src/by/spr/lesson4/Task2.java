package by.spr.lesson4;

public class Task2 {

	public static void main(String[] args) {

		// Задача 2
		// Дан массив A вещественного типа, содержащий 20 положительных и отрицательных
		// элементов. Сформировать массив B из положительных элементов массива A,
		// имеющих четный индекс. Найти сумму квадратов элементов нового массива.

		// Пример выполнения программы:
		// Array A:
		// -1.49 0.50 -4.70 -1.08 -4.95 1.14 -2.46 2.61 -3.14 4.35
		// 0.52 1.24 4.29 -2.39 -3.95 -4.91 -4.35 3.60 2.50 -0.21
		// Array B:
		// 0.50 1.14 2.61 4.35 1.24 3.60
		// sq.sum = 41.78

		double a[] = { -1.49, 0.50, -4.70, -1.08, -4.95, 1.14, -2.46, 2.61, -3.14, 4.35, 0.52, 1.24, 4.29, -2.39, -3.95,
				-4.91, -4.35, 3.60, 2.50, -0.21 };

		System.out.println(" A array: \n");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}

		}

		int j = 0;
		double sum = 0;

		for (int i = 1; i < a.length; i = i + 2) {
			if (a[i] > 0) {
				j++;
			}

		}

		double b[] = new double[j];

		System.out.println("\n B array: \n");

		int k = 0;
		while (k < b.length) {
			for (int i = 1; i < a.length; i = i + 2) {
				if (a[i] > 0) {
					b[k] = a[i];
					System.out.print(b[k] + "\t");
					sum = sum + b[k] * b[k];
					k = k + 1;

				}

			}
		}

		sum = sum * 100;
		int f = (int) Math.round(sum);
		sum = (double) f / 100;

		System.out.println("\n\n Sum of squares B array elements = " + sum);

	}

}
