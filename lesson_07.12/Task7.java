package FifthTasks;

import java.util.Arrays;
import java.util.Random;

//7. Даны два двумерных массива одинаковых размеров.
//а) Создать третий массив такого же размера, каждый элемент которого равен
// сумме соответствующих элементов двух первых массивов.
//б) Создать третий массив такого же размера, каждый элемент которого равен 100,
// если соответствующие элементы двух первых массивов имеют одинаковый знак, и равен нулю в противном случае.
public class Task7 {

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

    public static int getSum(int[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static int[][] getThirdMatrix(int sum1, int sum2, int row, int column) {
        int[][] matrix = new int[row][column];
        int value = sum1 + sum2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static boolean hasTheSameSign(int[][] matrix1, int[][] matrix2) {
        boolean allPositive = true;
        boolean allNegative = true;
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix1[i][j] < 0 || matrix2[i][j] < 0) {
                    allPositive = false;
                }
                if (matrix1[i][j] >= 0 || matrix2[i][j] >= 0) {
                    allNegative = false;
                }
            }
        }

        return allPositive || allNegative;
    }

    public static int[][] getThirdMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               if (hasTheSameSign(matrix1, matrix2)) {
                   matrix[i][j] = 100;
               } else {
                   matrix[i][j] = 0;
               }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int size = 4;

        int[][] matrix1 = fillMatrix(size, size);
        int[][] matrix2 = fillMatrix(size, size);

        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);

        int sum1 = getSum(matrix1);
        int sum2 = getSum(matrix2);

        System.out.println();
//        a)
        int[][] matrix3 = getThirdMatrix(sum1, sum2, size, size);
        printMatrix(matrix3);

        System.out.println();
//        boolean isTheSame = hasTheSameSign(matrix1, matrix2);
//        System.out.println(isTheSame);
//        б)
        int[][] matrix4 = getThirdMatrix(matrix1, matrix2);
        printMatrix(matrix4);
    }
}
