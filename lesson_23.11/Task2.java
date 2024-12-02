package third_tasks;

//	Даны n пар чисел: [a_1,b_1  a_2,b_2…a_n,b_n]. Определить:
//а) максимальную сумму значений чисел в паре;
//б) минимальное произведение значений чисел в паре.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество пар чисел:");
        int n = scanner.nextInt();

//      Integer.MIN_VALUE — это наименьшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить максимальное значение).
//      Если в процессе поиска максимальной суммы в массиве мы сравниваем элементы с maxSum,
//      любое значение в нем будет больше Integer.MIN_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым максимумом.
        int maxSum = Integer.MIN_VALUE;

//      Integer.MAX_VALUE — это наибольшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить минимальное значение).
//      Если в процессе поиска минимального произведения в массиве мы сравниваем элементы с minProduct,
//      любое значение в нем будет меньше Integer.MAX_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым минимумом.
        int minProduct = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите числа a и b для пары " + (i + 1) + ":");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a + b;
            int product = a * b;

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (product < minProduct) {
                minProduct = product;
            }
        }

        System.out.println("Максимальная сумма значений чисел в паре: " + maxSum);
        System.out.println("Минимальное произведение значений чисел в паре: " + minProduct);

        scanner.close();

    }
}
