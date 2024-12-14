package FifthTasks;
//8. Дан двумерный массив размером n x n. Сформировать:
//а) одномерный массив из элементов заданного массива, расположенных над главной диагональю;
//б) одномерный массив из элементов заданного массива, расположенных под главной диагональю;
//в) одномерный массив из элементов заданного массива, расположенных над побочной диагональю;
//г) одномерный массив из элементов заданного массива, расположенных под побочной диагональю.

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(-100,100);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] aGetNewArray(int[][] matrix, int n) {
        // Определяем количество элементов над главной диагональю
        int count = (n * (n - 1)) / 2;
        int[] array = new int[count];

        // Извлечение элементов над главной диагональю
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                array[index++] = matrix[i][j];
            }
        }

        return array;
    }

    public static int[] bGetNewArray(int[][] matrix, int n) {
        // Определяем количество элементов под главной диагональю
        int count = (n * (n - 1)) / 2;
        int[] array = new int[count];

        int index = 0;
        for (int i = 1; i < n; i++) { // начинаем с 1, чтобы пропустить первую строку
            for (int j = 0; j < i; j++) { // проходим по всем столбцам до i
                array[index++] = matrix[i][j];
            }
        }

        return array;
    }

    public static int[] cGetNewArray(int[][] matrix, int n) {
        int count = (n * (n - 1)) / 2;
        int[] array = new int[count];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    array[index++] = matrix[i][j];
                }
            }
        }

        return array;
    }

    public static int[] eGetNewArray(int[][] matrix, int n) {
        int count = (n * (n - 1)) / 2;
        int[] array = new int[count];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j > n - 1) {
                    array[index++] = matrix[i][j];
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = fillMatrix(n, n);
        printMatrix(matrix);

        System.out.println();
        //а) одномерный массив из элементов заданного массива, расположенных над главной диагональю;
        int[] aArray = aGetNewArray(matrix, n);
        System.out.println(Arrays.toString(aArray));

        System.out.println();
        //б) одномерный массив из элементов заданного массива, расположенных под главной диагональю;
        int[] bArray = bGetNewArray(matrix, n);
        System.out.println(Arrays.toString(bArray));

        System.out.println();
        //в) одномерный массив из элементов заданного массива, расположенных над побочной диагональю;
        int[] cArray = cGetNewArray(matrix, n);
        System.out.println(Arrays.toString(cArray));

        System.out.println();
        //г) одномерный массив из элементов заданного массива, расположенных под побочной диагональю.
        int[] eArray = eGetNewArray(matrix, n);
        System.out.println(Arrays.toString(eArray));
    }
}
