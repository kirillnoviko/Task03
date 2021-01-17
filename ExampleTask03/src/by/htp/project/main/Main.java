package by.htp.project.main;

import by.htp.project.*;
import by.htp.project.task03.Task03;

public class Main {

	public static void main(String[] args) {
		Task03 matrixMN = new Task03(3, 6); // массив массивов MxN
		Task03 matrixNN = new Task03(4); // массив массивов NxN

		matrixNN.inputRandom(15, -15);

		
		
		
		// 1. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		matrixNN.printmass();
		System.out.println();
		matrixNN.printDiag();

		System.out.println();
		matrixMN.inputRandom(5, 0);

		
		
		
		
		// 2. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		matrixMN.printmass();
		matrixMN.printKandP(2, 3);

		
		
		
		
		// 3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		// первая строка справа налево, вторая
		// строка слева направо, третья строка справа налево и так далее.
		matrixMN.printmass();
		matrixMN.printMasMN();

		
		
		
		
		// 4.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		matrixNN.inputMatrixN();
		matrixNN.printmass();

		
		
		
		
		// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		matrixNN.inputMatrixNDiagonal();
		matrixNN.printmass();

		
		
		
		// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		matrixNN.inputMatrixNullandOne();
		matrixNN.printmass();

		
		
		
		// 7. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		matrixNN.inputMatrixHalfDiag();
		matrixNN.printmass();

		
		
		
		
		// 8. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		matrixNN.inputMatrixHalfDiagN();
		matrixNN.printmass();

		
		
		
		
		// 9. Дан линейный массив n
		// Получить действительную квадратную матрицу порядка n:
		int[] mas = new int[] { 1, 2, 3, 4, 5 };
		matrixNN.matrixElementSquer(mas);
		matrixNN.printmass();

		
		
		
		// 10. Найти положительные элементы главной диагонали квадратной матрицы.
		mas = matrixNN.matrixSumDiag();
		matrixNN.printmass();
		System.out.println("положительные элементы диагонали :");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("   " + mas[i]);
		}

		System.out.println();
		
		
		
		
		
		// 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
		// саму матрицу и номера строк, в
		// которых число 5 встречается три и более раз.
		Task03 matrix = new Task03(10, 20);
		matrix.inputRandom(15, 0);
		matrix.printmass();
		matrix.matrix10x20();

		System.out.println();

		
		
		
		
		
		// 12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
		// в каждом столбце число
		// единиц равно номеру столбца.
		matrixMN.matrixNullAndOne();
		matrixMN.printmass();

		// второй вариант решения 12 задачи/
		matrixMN.setN(4);
		matrixMN.setN(8);
		matrixMN.matrixNullAndOneExample2();
		matrixMN.printmass();

		matrixMN.setN(6);
		matrixMN.setN(3);
		matrixMN.matrixNullAndOneExample2();
		matrixMN.printmass();

	}

}
