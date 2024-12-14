package FifthTasks;

//Дан двумерный массив.
//        а) Выяснить, является ли сумма элементов четвертой строки массива двузначным числом.
//        б) Составить программу, определяющую, верно ли, что произведение элементов столбца
//        массива с известным номером не превышает заданного числа?

import java.util.Arrays;
import java.util.Random;

public class Task2 {

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

    public static boolean isTwoDigit(int sum) {
        return sum >= 10 && sum <= 99;
    }

    public static int getSum(int[][] matrix, int rowIndex){
        int sum = 0;
        int size = matrix[rowIndex].length;

        for (int j = 0; j < size; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }

    public static int getProduct(int[][] matrix, int columnIndex) {
        int product = 1;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            product *= matrix[i][columnIndex];
        }
        return product;
    }

    public static boolean isValueGreater(int value, int inputNumber){
        return (value > inputNumber);
    }

    public static void main(String[] args) {

        int[][] matrix = fillMatrix(5, 5);
        printMatrix(matrix);

//        a)
        int sum = getSum(matrix, 4);
        System.out.println(sum);

        boolean isTwoDigit = isTwoDigit(sum);
        System.out.println(isTwoDigit);

//        б)
        int product = getProduct(matrix, 4);
        System.out.println(product);

        boolean isValueGreater = isValueGreater(product, 50);
        System.out.println(isValueGreater);
    }
}
