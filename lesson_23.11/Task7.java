package third_tasks;

//Определить:
//а) сумму всех элементов массива;
//б) произведение всех элементов массива;
//в) сумму квадратов всех элементов массива;
//г) сумму первых шести элементов массива;
//д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся с клавиатуры; k2 > k1);
//е) среднее арифметическое всех элементов массива;
//ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1 и s2 вводятся с клавиатуры; s2 > s1)

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // a) Сумма всех элементов массива
        // б) Произведение всех элементов массива
        // в) Сумма квадратов всех элементов массива
        int sum = 0;
        long product = 1;
        int sumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            product *= array[i];
            sumOfSquares += array[i] * array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Произведение всех элементов массива: " + product);
        System.out.println("Сумма квадратов всех элементов массива: " + sumOfSquares);

        // г) Сумма первых шести элементов массива
        int sumFirstSix = 0;
        for (int i = 0; i < Math.min(6, n); i++) {
            sumFirstSix += array[i];
        }
        System.out.println("Сумма первых шести элементов массива (если их меньше шести, то всех доступных): " + sumFirstSix);

        // д) Сумма элементов массива с k1-го по k2-й
        System.out.print("Введите значение k1 (начальный индекс): ");
        int k1 = scanner.nextInt();
        System.out.print("Введите значение k2 (конечный индекс): ");
        int k2 = scanner.nextInt();

        if (k1 < 0 || k2 >= n || k1 >= k2) {
            System.out.println("Ошибка: неверные значения k1 и k2.");
        } else {
            int sumK1K2 = 0;
            for (int i = k1; i <= k2; i++) {
                sumK1K2 += array[i];
            }
            System.out.println("Сумма элементов с " + k1 + "-го по " + k2 + "-й: " + sumK1K2);
        }

        // е) Среднее арифметическое всех элементов массива
        double average = (double) sum / n;
        System.out.println("Среднее арифметическое всех элементов массива: " + average);

        // ж) Среднее арифметическое элементов массива с s1-го по s2-й
        System.out.print("Введите значение s1 (начальный индекс): ");
        int s1 = scanner.nextInt();
        System.out.print("Введите значение s2 (конечный индекс): ");
        int s2 = scanner.nextInt();

        if (s1 < 0 || s2 >= n || s1 >= s2) {
            System.out.println("Ошибка: неверные значения s1 и s2.");
        } else {
            int sumS1S2 = 0;
            for (int i = s1; i <= s2; i++) {
                sumS1S2 += array[i];
            }
            double averageS1S2 = (double) sumS1S2 / (s2 - s1 + 1);
            System.out.println("Среднее арифметическое элементов с " + s1 + "-го по " + s2 + "-й: " + averageS1S2);

        scanner.close();
    }
    }
}
