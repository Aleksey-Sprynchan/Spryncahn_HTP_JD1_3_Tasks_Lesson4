package by.spr.lesson4;

public class Task6 {

	public static void main(String[] args) {

		// В двумерном массиве натуральных случайных чисел от 0 до 199 найти
		// количество всех двузначных чисел, у которых сумма цифр кратна 2.


		int x[][] = new int[20][10];

		int k = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				x[i][j] = k;
				k++;
			}
		}

		System.out.println("\n Array filled with natural number from 0 to 199 (20х10):\n");

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}

		int count = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				if (x[i][j] > 9 && x[i][j] < 100) {
					int frstnumeral = x[i][j] / 10;
					int scndnumeral = x[i][j] % 10;
					int sum = frstnumeral + scndnumeral;
					if (sum % 2 == 0) {
						count++;
					}

				}

			}

		}
		
		System.out.println("\n The number of two-valued elements, whose sum of digits is a multiple of 2 = " + count);
	}

}
