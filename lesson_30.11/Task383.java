package FourthTasks;

import java.util.Random;

//Дана действительная матрица размера 18 х n.
//Найти значение наибольшего по модулю элемента матрицы,
//а также индексы какого-нибудь элемента с найденным значением модуля.
public class Task383 {
    public static void main(String[] args) {
        Random random = new Random();

        int rows = 18;
        int cols = 5;
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextDouble() * 20 - 10; // Генерация числа от -10 до 10
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        double maxNumber = Math.abs(matrix[0][0]);
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Math.abs(matrix[i][j]) > maxNumber) {
                    maxNumber = Math.abs(matrix[i][j]);

                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.printf("\nНаибольший по модулю элемент = %.2f", maxNumber);
        System.out.printf("\nИндексы %d %d", indexI, indexJ);
    }
}
