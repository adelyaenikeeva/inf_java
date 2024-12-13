package FourthTasks;

import java.util.Random;

//В данной квадратной целочисленной матрице порядка 17
//указать индексы всех элементов с наибольшим значением.
public class Task388 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 17;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(-10, 10);
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        int maxNumber = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maxNumber == matrix[i][j]) {
                    System.out.printf("\nИндексы %d %d\n", i, j);
                }
            }
        }
    }
}
