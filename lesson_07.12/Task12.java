package FifthTasks;

import java.util.Random;

//Задание: Создайте ступенчатый массив с разным количеством элементов
//в каждой строке. Напишите метод, который принимает ступенчатый массив и
//возвращает сумму всех его элементов. Реализуйте программу, которая демонстрирует работу этого метода.
public class Task12 {

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

    public static int getSum(int[][] jaggedArray) {
        int sum = 0;
        for (int[] row : jaggedArray) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] columnCounts = {3, 1, 4, 1, 5};
        int[][] jaggedArray = getJaggedArray(columnCounts);

        printJaggedArray(jaggedArray);

        int sum = getSum(jaggedArray);
        System.out.println("Сумма всех элементов: " + sum);
    }
}
