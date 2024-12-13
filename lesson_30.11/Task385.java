package FourthTasks;

import java.util.Random;

//В данной действительной квадратной матрице порядка n
//найти сумму элементов строки, в которой расположен элемент с
//наименьшим значением. Предполагается, что такой элемент единственный.
public class Task385 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 5;
        double[][] matrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextDouble() * 20 - 10;
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        double minNumber = matrix[0][0];
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] < minNumber) {
                    minNumber = matrix[i][j];
                    minIndex = i;
                }
            }
        }

        double sum = 0;

        // Проверка на уникальность наименьшего элемента
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == minNumber) {
                    count++;
                }
            }
        }

        if (count == 1) {
            for (int j = 0; j < size; j++) {
                sum += matrix[minIndex][j];
            }
        } else {
            System.out.println("Элемент не единственный");
        }


        System.out.printf("Сумма элементов: %.2f", sum);
    }
}
