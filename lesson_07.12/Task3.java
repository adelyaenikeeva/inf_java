package FifthTasks;

//Дан двумерный массив. Составить программу, которая определяет максимальное
// из двух чисел: суммы элементов k-й строки и суммы элементов
//s-го столбца массива.

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5,15);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int getSumInKRow(int[][] matrix, int k) {
        int sum = 0;
        int size = matrix[k].length;

        for (int j = 0; j < size; j++) {
            sum += matrix[k][j];
        }
        return sum;
    }

    public static int getSumInSColumn(int[][] matrix, int s) {
        int sum = 0;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][s];
        }
        return sum;
    }

    public static void findMax(int sumInKRow, int sumInSColumn) {
        if (sumInKRow > sumInSColumn) {
            System.out.println("sumInKRow > sumInSColumn");
        } else if (sumInKRow < sumInSColumn) {
            System.out.println("sumInKRow < sumInSColumn");
        } else {
            System.out.println("sumInKRow = sumInSColumn");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(3,4);
        printMatrix(matrix);

        int sumInKRow = getSumInKRow(matrix, 2);
        int sumInSColumn = getSumInSColumn(matrix, 2);

        findMax(sumInKRow, sumInSColumn);
    }
}
