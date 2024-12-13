package FourthTasks;

import java.util.Random;

//Дана целочисленная квадратная матрица порядка 8. Найти
//наименьшее из значений элементов столбца, который обладает
// наибольшей суммой модулей элементов.
// Если таких столбцов несколько, то взять первый из них.
public class Task392 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 8;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(-10, 10);
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        int colsIndex = 0;

        for (int j = 0; j < size; j++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += Math.abs(matrix[i][j]);
            }

            if (sum > maxSum) {
                maxSum = sum;
                colsIndex = j;
            }
        }

        int minNumber = matrix[0][colsIndex];
        for (int i = 1; i < size; i++) {
            if (matrix[i][colsIndex] < minNumber) {
                minNumber = matrix[i][colsIndex];
            }
        }

        System.out.printf("%d ", minNumber);
    }
}
