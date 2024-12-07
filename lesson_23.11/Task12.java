package third_tasks;

//Дана действительная матрица размера n x m, в которой не все элементы равны нулю.
// Получить новую матрицу путем деления всех элементов данной матрицы на ее наибольший по модулю элемент.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк (n): ");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов (m): ");
        int m = scanner.nextInt();

        double[][] matrix = new double[n][m];
        double maxAbsValue = 0;

        System.out.println("Введите элементы матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double absValue = Math.abs(matrix[i][j]);
                if (absValue > maxAbsValue) {
                    maxAbsValue = absValue;
                }
            }
        }

        if (maxAbsValue != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] /= maxAbsValue;
                    System.out.printf("%.2f ", matrix[i][j]);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
