package FourthTasks;

import java.util.Random;

//Даны натуральное число п, действительная квадратная
//матрица порядка п, действительные а, ,..., An+5.
//Элементы последовательности а,...,а,+5
//Домножить на 10, если наибольший элемент матрицы (в предположении, что такой элемент единственный)
//находится на главной диагонали, и на 0.5 в противном случае.
public class Task387 {
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

        double[] array = new double[size + 5];
        for (int i = 0; i < size + 5; i++) {
            array[i] = random.nextDouble() * 20 - 10;
            System.out.print(array[i] + " ");
        }

        double maxNumber = matrix[0][0];
        int indexRow = 0;
        int indexColum = 0;
        boolean isUnique = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                    indexRow = i;
                    indexColum = j;
                    isUnique = true;
                } else if (maxNumber == matrix[i][j]) {
                    isUnique = false;
                }
            }
        }

//        double coeff;
//
//        if (indexRow == indexColum) {
//            coeff = 10;
//        } else {
//            coeff = 0.5;
//        }

        double coeff = (isUnique && indexRow == indexColum) ? 10 : 0.5;

        for (int i = 0; i < size + 5; i++) {
            array[i] *= coeff;
        }

        for (double arr : array) {
            System.out.print(arr + " ");
        }
    }
}
