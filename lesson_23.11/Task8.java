package third_tasks;

//Дан массив. Определить:
//а) максимальный элемент массива и элемент, являющийся максимальным без учета этого элемента;
//б) минимальный элемент массива и элемента, являющегося минимальным без учета этого элемента;
//в) номера минимального элемента массива и элемента, являющегося минимальным без учета этого элемента.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }

        int[] array = {3, 5, 15, 1, 2, 8, 6, 2, 8, 4, 12, 20};

//      Integer.MIN_VALUE — это наименьшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить максимальное значение).
//      Если в процессе поиска максимального элемента в массиве мы сравниваем элементы с max,
//      любое значение в нем будет больше Integer.MIN_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым максимумом.
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

//      Integer.MAX_VALUE — это наибольшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить минимальное значение).
//      Если в процессе поиска минимального элемента в массиве мы сравниваем элементы с min,
//      любое значение в нем будет меньше Integer.MAX_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым минимумом.
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int minIndex = -1;
        int secondMinIndex = -1;

        // Поиск максимального и минимального элементов
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                secondMax = max; // обновляем второй максимум
                max = array[i]; // обновляем максимум
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i]; // обновляем второй максимум
            }

            if (array[i] < min) {
                secondMin = min; // обновляем второй минимум
                min = array[i]; // обновляем минимум
                minIndex = i; // сохраняем индекс минимума
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i]; // обновляем второй минимум
                secondMinIndex = i; // сохраняем индекс второго минимума
            }
        }

        System.out.printf("Максимальный элемент: %d \n", max);
        System.out.printf("Элемент, являющийся максимальным без учета этого элемента: %d \n", secondMax);
        System.out.printf("Минимальный элемент: %d \n", min);
        System.out.printf("Элемент, являющийся минимальным без учета этого элемента: %d \n", secondMin);
        System.out.printf("Индекс минимального элемента: %d \n", minIndex);
        System.out.printf("Индекс элемента, являющегося минимальным без учета этого элемента: %d \n", secondMinIndex);

    }
}
