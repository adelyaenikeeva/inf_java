package FourthTasks;

import java.util.Random;

//Дана действительная матрица размера 6×9. Найти среднее
//арифметическое наибольшего и наименьшего значений ее элементов.
public class Task382 {
    public static void main(String[] args) {
        Random random = new Random();

        int rows = 6;
        int cols = 9;
        double[][] matrix = new double[rows][cols];

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextDouble() * 20 - 10; // Генерация числа от -10 до 10
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        double maxNumber = Double.NEGATIVE_INFINITY;
        double minNumber = Double.POSITIVE_INFINITY;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                }

                if (matrix[i][j] < minNumber) {
                    minNumber = matrix[i][j];
                }
            }
            System.out.println();
        }

        double result = (maxNumber + minNumber)/2.0;

        System.out.printf("Среднее арифметическое: %.2f", result);
    }
}
