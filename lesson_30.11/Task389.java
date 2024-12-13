package FourthTasks;

import java.util.Random;

//Дана действительная матрица размера m х n, все элементы
//которой различны. В каждой строке выбирается элемент с наименьшим значением,
//затем среди этих чисел выбирается наибольшее. Указать индексы элемента с найденным значением.
public class Task389 {
    public static void main(String[] args) {
        Random random = new Random();

        int m = 3;
        int n = 4;
        double[][] matrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextDouble() * 20 - 10;
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        double[] array = new double[m];
        int[] rowIndices = new int[m];
        int[] colsIndices = new int[m]
;
        for (int i = 0; i < m; i++) {
            double minNumber = matrix[i][0];
            rowIndices[i] = i;
            colsIndices[i] = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minNumber) {
                    minNumber = matrix[i][j];
                    colsIndices[i] = j;
                }
            }
            array[i] = minNumber;
        }

        double maxNumber = array[0];
        int maxRowIndices = rowIndices[0];
        int maxColsIndices = colsIndices[0];

        for (int i = 1; i < m; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxRowIndices = rowIndices[i];
                maxColsIndices = colsIndices[i];
            }
        }

        System.out.printf("Максимальное число: %.2f%n", maxNumber);
        System.out.printf("Индексы числа: %d %d%n ", maxRowIndices + 1, maxColsIndices + 1);
    }
}
