package FifthTasks;

import java.util.Arrays;
import java.util.Random;

//1. Дан двумерный массив.
//а) Выяснить, является ли произведение элементов второго столбца массива трехзначным числом.
//б) Составить программу, определяющую, верно ли, что сумма элементов строки массива с
// известным номером превышает заданное число?
public class Task1 {

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

    public static int getProduct(int[][] matrix) {
        int product = 1;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            product *= matrix[i][1];
        }
        return product;
    }

    public static boolean isThreeDigit(int product) {
//        int count = 0;
//        while (product > 0) {
//            product /=10;
//            count ++;
//        }
//
//        return (count == 3);
        return product >= 100 && product <= 999;
    }

    public static int getSum(int[][] matrix, int rowIndex){
        int sum = 0;
        int size = matrix[rowIndex].length;

        for (int j = 0; j < size; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }

    public static boolean isValueGreater(int sum, int inputNumber){
        return (sum > inputNumber);
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fillArray(5)));

        int[][] matrix = fillMatrix(3,4);
        printMatrix(matrix);

//        а)
        int product = getProduct(matrix);
        boolean isThreeDigit = isThreeDigit(product);
        System.out.println(isThreeDigit);

//        б)
        int sumResult = getSum(matrix, 2);
        System.out.println(sumResult);
        boolean isValueGreater = isValueGreater(sumResult, 100);
        System.out.println(isValueGreater);
    }
}
