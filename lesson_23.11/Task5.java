package third_tasks;

//5.	Дано целое число K и набор ненулевых целых чисел, признак его завершения – число 0.
// Вывести номер первого числа, большего К. Если таких чисел нет, то вывести 0.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число K:");
        int K = scanner.nextInt();

        System.out.println("Введите набор ненулевых чисел (0 для завершения):");

        int index = 1; // Индекс текущего числа (начинаем с 1)
        int firstGreaterIndex = 0; // Индекс первого найденного числа больше K

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            // Проверяем, больше ли текущее число K
            if (number > K && firstGreaterIndex == 0) {
                firstGreaterIndex = index; // Запоминаем индекс первого числа больше K
            }
            index++;
        }

        System.out.println(firstGreaterIndex);

        scanner.close();
    }
}
