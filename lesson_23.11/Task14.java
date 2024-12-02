package third_tasks;

//Дана целочисленная квадратная матрица порядка 15.
// Выяснить, имеются ли в матрице ненулевые элементы, и если имеются, то указать индексы:
//а) одного из ненулевых элементов;
//б) всех ненулевых элементов.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 15;
        int[][] matrix = new int[size][size];

        System.out.printf("Введите элементы матрицы %dx%d: \n", size, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isFound = false;
        //а) одного из ненулевых элементов;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Ненулевой элемент найден по индексу: [" + i + "][" + j + "]");
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
               break;
            }
        }
        System.out.println();

        //б) всех ненулевых элементов.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Ненулевой элемент найден по индексу: [" + i + "][" + j + "]");
                }
            }
        }

        scanner.close();
    }
}
