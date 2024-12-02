package third_tasks;

//Дана действительная матрица размера n x m.
// Найти среднее арифметическое наибольшего и наименьшего значений ее элементов.

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов (m): ");
        int m = scanner.nextInt();

        double[][] matrix = new double[n][m];

//      Предполагаем, что макс и мин элементы - первые элементы матрицы (или можно воспользоваться Double.MIN_VALUE/Double.MAX_VALUE)
        double min = matrix[0][0];
        double max = matrix[0][0];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        double average = (min + max) / 2.0;

        System.out.println("Наименьшее значение: " + min);
        System.out.println("Наибольшее значение: " + max);
        System.out.println("Среднее арифметическое наибольшего и наименьшего значений: " + average);

        scanner.close();

    }
}
