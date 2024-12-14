package FifthTasks;

import java.util.Arrays;
import java.util.Random;

//Дан двумерный массив целых чисел. Определить:
//а) есть ли в нем столбец, состоящий только из нулей;
//б) есть ли в нем столбец, состоящий только из элементов, принадлежащих промежутку от 0 до b;
//в) есть ли в нем столбец, состоящий только из четных элементов;
//г) есть ли в нем столбец, в котором равное количество положительных и отрицательных элементов;
//д) есть ли в нем столбец, в котором имеются одинаковые элементы;
//е) есть ли в нем столбец, в котором имеются как минимум три элемента, являющиеся минимальными в массиве.
public class Task4 {

    public static int[][] fillMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static boolean zerosInColumn(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Проходим по каждому столбцу
        for (int j = 0; j < column; j++) {
            boolean allZeros = true;
        // Проверяем каждую строку в текущем столбце
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] != 0) {
                    allZeros = false;
                    break;
                }
            }
            // Если мы нашли столбец, который состоит только из нулей, возвращаем true
            if (allZeros) {
                return true;
            }
        }
        // Если не нашли ни одного столбца, состоящего только из нулей
        return false;
    }

    public static boolean hasColumnInRange(int[][] matrix, int b) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Проходим по каждому столбцу
        for (int j = 0; j < column; j++) {
            boolean isInRange = true;
            // Проверяем каждую строку в текущем столбце
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] < 0 || matrix[i][j] > b) {
                    isInRange = false;
                    break;
                }
            }
            if (isInRange) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasEvenNumbers(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Проходим по каждому столбцу
        for (int j = 0; j < column; j++) {
            boolean isEven = true;
            // Проверяем каждую строку в текущем столбце
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] % 2 != 0) {
                    isEven = false;
                    break;
                }
            }
            if (isEven) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasTheSameNumbers(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Проходим по каждому столбцу
        for (int j = 0; j < column; j++) {
            // Проверяем каждую строку в текущем столбце
            for (int i = 0; i < row; i++) {
                for (int k = i + 1; k < row; k++) {
                    // Если находим совпадение, возвращаем true
                    if (matrix[i][j] == matrix[k][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isEqualColumn(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Проходим по каждому столбцу
        for (int j = 0; j < column; j++) {
            int positiveCount = 0;
            int negativeCount = 0;
            // Проверяем каждую строку в текущем столбце
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                } else if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }
            if (positiveCount == negativeCount) {
                return true;
            }
        }
        return false;
    }

    public static int findMin(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static boolean hasThreeMinElements(int[][] matrix, int min) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int j = 0; j < column; j++) {
            int count = 0;
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] == min) {
                    count++;
                }
            }
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = fillMatrix(5, 5);
//        printMatrix(matrix);

        int[][] matrix = {
                {0, 1, 4, -2},
                {0, 2, 4, -3},
                {0, 3, 4, 3},
                {0, 3, 4, 4},
        };

//        a)
        boolean allZeros = zerosInColumn(matrix);
        System.out.println(allZeros);

//        б)
        boolean isInRange = hasColumnInRange(matrix, 3);
        System.out.println(isInRange);

//        в)
        boolean isEven = hasEvenNumbers(matrix);
        System.out.println(isEven);

//        г)
        boolean isEqualColumn = isEqualColumn(matrix);
        System.out.println(isEqualColumn);

//        д)
        boolean hasTheSameNumbers = hasTheSameNumbers(matrix);
        System.out.println(hasTheSameNumbers);

//        е)
        int min = findMin(matrix);
        boolean hasThreeMin = hasThreeMinElements(matrix, min);
        System.out.println(hasThreeMin);
    }
}
