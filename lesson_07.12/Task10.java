package FifthTasks;

import java.util.Random;
import java.util.Scanner;

//Создание и Заполнение Ступенчатого Массивa
//   Задание: Напишите программу, которая создаёт ступенчатый массив,
//   где количество строк и количество столбцов в каждой строке вводится пользователем.
//   Заполните массив случайными числами от 0 до 100. Выведите массив в виде таблицы.
public class Task10 {

    public static int[][] getJaggedArray(int[] columnCounts) {
        // Создаем массив с количеством строк
        int size = columnCounts.length;
        int[][] jaggedArray = new int[size][];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Создаем каждую строку с заданным количеством столбцов
            jaggedArray[i] = new int[columnCounts[i]];
            for (int j = 0; j < columnCounts[i]; j++) {
                jaggedArray[i][j] = random.nextInt(10, 101);
            }
        }
        return jaggedArray;
    }

    // функция для вывода массива на экран
    public static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите кол-во строк: ");
        int row = scanner.nextInt();

        System.out.println("Введите кол-во столбцов: ");
        int[] columnArray = new int[row];

        for (int i = 0; i < row; i++) {
            columnArray[i] = random.nextInt(2, 20);
        }

        int[][] result = getJaggedArray(columnArray);
        printJaggedArray(result);
    }
}
