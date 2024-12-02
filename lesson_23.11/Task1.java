package third_tasks;

//	Даны натуральное число n и целые числа [a_1,a_2…a_n]. Найти:
//	a) номер максимального из чисел a_i.
//	Если чисел с максимальным значением несколько, то должен быть найден номер последнего из них;
//  б) номер минимального из чисел a_i.
//  Если чисел с минимальным значением несколько, то должен быть найден номер первого из них;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов n: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

//      Инициализация maxIndex и minIndex нулем позволяет использовать
//      первый элемент массива как базу для сравнения с остальными элементами.
        int maxIndex = 0;
        int minIndex = 0;

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
//          >=, чтобы найти индекс именно последнего макс элемента
            if (array[i] >= array[maxIndex]) {
                maxIndex = i;
            }
//          <, чтобы найти индекс именно первого мин элемента
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("Индекс последнего максимального элемента: " + maxIndex);
        System.out.println("Индекс первого минимального элемента: " + minIndex);
    }
}
