package by.htp.project.task03;

public class Task03 {
	int[][] matrix;
	int m;
	int n;

	public Task03(int a, int b) {
		m = a;
		n = b;

		matrix = new int[m][n];
	}

	public Task03(int a) {
		m = a;
		n = a;

		matrix = new int[m][n];
	}

	public void setN(int a) {
		n = a;
	}

	public void senM(int a) {
		m = a;
	}

	public void inputRandom(int max, int min) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) ((Math.random() * (max - min)) + min);
			}
		}

	}

	public void printmass() {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("   " + matrix[i][j]);
			}

			System.out.println();

		}

		System.out.println();

	}

	// 1. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	public void printDiag() {

		for (int i = 0; i < n; i++) {
			System.out.print("    " + matrix[i][i]);
		}

	}

	// 2. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	public void printKandP(int k, int p) {
		System.out.println(k + " строка");

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				if (i == k - 1) {
					System.out.print("  " + matrix[i][j]);
				}
			}

		}

		System.out.println();
		System.out.println(p + " столбец:");

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				if (j == p - 1) {
					System.out.print("  " + matrix[i][j]);
				}
			}

		}

	}

	// 3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
	// первая строка справа налево, вторая
	// строка слева направо, третья строка справа налево и так далее.
	public void printMasMN() {

		System.out.println();

		for (int i = 0; i < m; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j]);
				}

			} else {

				for (int j = n - 1; j >= 0; j--) {
					System.out.print(matrix[i][j]);
				}

			}

			System.out.println();
		}

	}

	// 4.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	public void inputMatrixN() {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {
					matrix[i][j] = j + 1;
				} else {
					matrix[i][j] = n - j;
				}

			}

		}

	}

	// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	// четное):
	public void inputMatrixNDiagonal() {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j == n - i - 1) {
					matrix[i][j] = i + 1;
				} else {
					matrix[i][j] = 0;
				}

			}

		}

	}

	// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	// четное):
	public void inputMatrixNullandOne() {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}

			}

		}
	}

	// 7. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	// четное):
	public void inputMatrixHalfDiag() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j <= n - i - 1) {
					matrix[i][j] = i + 1;
				} else {
					matrix[i][j] = 0;
				}
			}

		}
	}

	// 8. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	// четное):
	public void inputMatrixHalfDiagN() {

		int temp = n;

		for (int i = 0; i < n; i++) {
			temp = n;
			for (int j = n - 1; j >= 0; j--) {

				if (j <= n - 1 - i) {
					matrix[i][j] = temp;
					temp--;

				} else {
					matrix[i][j] = 0;

				}
			}

		}
	}

	// 9. Дан линейный массив n
	// Получить действительную квадратную матрицу порядка n:
	public void matrixElementSquer(int[] mas) {
		n = mas.length;
		m = mas.length;
		matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) Math.pow(mas[j], i + 1);
			}
		}
	}

	// 10. Найти положительные элементы главной диагонали квадратной матрицы.
	public int[] matrixSumDiag() {

		int n = matrix.length;
		int[] elements = new int[n];
		int index = 0;

		for (int i = 0; i < n; i++) {

			if (matrix[i][i] >= 0) {
				elements[index] = matrix[i][i];
				index++;
			}

		}

		return elements;
	}

	// 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
	// саму матрицу и номера строк, в
	// которых число 5 встречается три и более раз.
	public void matrix10x20() {

		int count = 0;
		int rez = 3;
		int[] index = new int[m];
		int num = 0;

		System.out.println("число 5 встречается 3 и более раз в строках:");

		for (int i = 0; i < m; i++) {

			count = 0;

			for (int j = 0; j < n; j++) {

				if (matrix[i][j] == 5) {
					count++;
				}

			}

			if (rez <= count) {
				index[num] = i + 1;
				System.out.print("  " + index[num]);
				num++;
			}

		}

	}

	// 12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
	// в каждом столбце число
	// единиц равно номеру столбца.
	public void matrixNullAndOne() {
		matrix = new int[m][n];
		int count = 0;
		int temp = 0;

		for (int j = 0; j < n; j++) {

			count = 0;

			while (count != j + 1) {
				temp = (int) Math.floor(Math.random() * m + 1);

				if (matrix[temp - 1][j] == 0) {
					matrix[temp - 1][j] = 1;
					count++;
				} else {
					matrix[temp - 1][j] = matrix[temp - 1][j] * 10 + 1;
					count++;
				}

			}

		}

	}

	public void matrixNullAndOneExample2() {
		matrix = new int[m][n];

		if (m >= n) {
			int count = 0;
			int temp = 0;

			for (int j = 0; j < m; j++) {

				count = 0;

				while (count != j + 1) {

					temp = (int) Math.floor(Math.random() * m + 1);

					if (matrix[temp - 1][j] == 0) {
						matrix[temp - 1][j] = 1;
						count++;
					}

				}

			}
		} else {

			System.out.println(" error");

		}

	}

}
