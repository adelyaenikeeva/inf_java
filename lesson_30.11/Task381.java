package FourthTasks;

import java.util.Random;

//Все элементы с наибольшим значением в данной целочисленной квадратной матрице порядка 10 заменить нулями.
public class Task381 {

    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[][] matrix = new int[size][size];

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(1, 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nИзмененная матрица: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == maxNumber) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
