package FifthTasks;

import java.util.Random;

//Поиск Максимального Элемента:
//   Напишите программу, которая создает ступенчатый массив и находит максимальный элемент среди всех его значений.
//   и возвращает индексы строки и столбца, где находится этот максимальный элемент.
public class Task13 {

    public static int[][] getJaggedArray(int[] columnCounts) {
        // Создаем массив с количеством строк
        int size = columnCounts.length;
        int[][] jaggedArray = new int[size][];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Создаем каждую строку с заданным количеством столбцов
            jaggedArray[i] = new int[columnCounts[i]];
            for (int j = 0; j < columnCounts[i]; j++) {
                jaggedArray[i][j] = random.nextInt(101);
            }
        }
        return jaggedArray;
    }

    public static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[] findMaximum(int[][] jaggedArray) {
        int maxNumber = Integer.MIN_VALUE;
        int indexI = 0;
        int indexJ = 0;
        int rows = jaggedArray.length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (maxNumber < jaggedArray[i][j]) {
                    maxNumber = jaggedArray[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        return new int[]{maxNumber, indexI, indexJ};
    }

    public static void main(String[] args) {

        int[] columnCounts = {3, 1, 4, 1, 5};
        int[][] jaggedArray = getJaggedArray(columnCounts);

        printJaggedArray(jaggedArray);

        int[] maxNumber = findMaximum(jaggedArray);
        System.out.println(maxNumber[0]);
        System.out.println(maxNumber[1] + " " + maxNumber[2]);

    }
}
