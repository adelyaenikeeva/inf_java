package FourthTasks;

import java.util.Random;
//Дана действительная матрица размера m×n. Найти сумму
//наибольших значений элементов ее строк.
public class Task384 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 5;
        int cols = 6;

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] = random.nextDouble() * 20 - 10; // Генерация числа от -10 до 10
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        double sum = 0;

        for (int i = 0; i < rows; i++) {
            double maxInRow = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                }
            }
            sum += maxInRow;
        }

        System.out.printf("Сумма наибольших элементов: %.2f", sum);
    }
}
