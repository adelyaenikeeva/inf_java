package FifthTasks;

//Дан двумерный массив целых чисел.
//        а) Сформировать одномерный массив, каждый элемент которого равен первому
//        четному элементу соответствующего столбца двумерного массива
//        (если такого элемента в столбце нет, то он равен нулю).
//б) Сформировать одномерный массив, каждый элемент которого равен последнему
// нечетному элементу соответствующей строки двумерного массива
// (если такого элемента в строке нет, то он равен нулю).

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(3,20);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] findFirstEven(int[][] matrix) {
//        определеяем кол-во столбцов
        int columns = matrix[0].length;
        int rows = matrix.length;
        int[] array = new int[columns];

        for (int j = 0; j < columns; j++) {
            array[j] = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] % 2 == 0) {
                    array[j] = matrix[i][j];
                    break;
                }
            }
        }
        return array;
    }

    public static int[] findLastOdd(int[][] matrix) {
//        определеяем кол-во столбцов
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] array = new int[rows];

        for (int i = 0; i < rows; i++) {
            array[i] = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 != 0) {
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
        int[] evenArray = findFirstEven(matrix);
        System.out.println(Arrays.toString(evenArray));

        System.out.println();
        int[] oddArray = findLastOdd(matrix);
        System.out.println(Arrays.toString(oddArray));
    }
}
