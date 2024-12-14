package FifthTasks;

import java.util.Arrays;
import java.util.Random;

//Дан двумерный массив. Составить программу:
//а) которая переставляет две любые строки массива;
//б) которая переставляет два любых столбца массива.
//Обе задачи решить двумя способами:
//1) с использованием дополнительного одномерного массива;
//2) без использования дополнительного одномерного массива.
public class Task5 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5,10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void swapRowsUsingTempArray(int[][] matrix, int row1, int row2) {
        // Создаем временный одномерный массив
        int[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    public static void swapRowsWithoutTempArray(int[][] matrix, int row1, int row2) {
        int size = matrix[row1].length;

        for (int i = 0; i < size; i++) {
            // Обмениваем элементы
            int temp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp;
        }
    }

    public static void swapColumnsUsingTempArray(int[][] matrix, int col1, int col2) {
        int size = matrix.length;
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = matrix[i][col1];
        }
        for (int i = 0; i < size; i++) {
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp[i];
        }
    }

    public static void swapColumnsWithoutTempArray(int[][] matrix, int col1, int col2) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            int temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 4);
        printMatrix(matrix);

        System.out.println();
        swapRowsUsingTempArray(matrix, 0, 1);
        printMatrix(matrix);

        System.out.println();
        swapRowsWithoutTempArray(matrix, 0,1);
        printMatrix(matrix);

        System.out.println();
        swapColumnsUsingTempArray(matrix, 0, 1);
        printMatrix(matrix);

        System.out.println();
        swapColumnsWithoutTempArray(matrix, 0, 1);
        printMatrix(matrix);
    }
}
