package FifthTasks;

import java.util.Arrays;
import java.util.Random;

//9. Дан двумерный массив размером n x n, заполненный целыми числами.
//а) Все его элементы, кратные трем, записать в одномерный массив.
//б) Все его положительные элементы записать в один одномерный массив, а остальные — в другой.
public class Task9 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(-1000,1000);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] getNewArray(int[][] matrix, int n) {
        int maxSize = n * n;
        int[] array = new int[maxSize];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 3 == 0) {
                    array[i] = matrix[i][j];
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 4);
        printMatrix(matrix);
        System.out.println();

        int[] array = getNewArray(matrix, 4);
        System.out.println(Arrays.toString(array));
    }
}
