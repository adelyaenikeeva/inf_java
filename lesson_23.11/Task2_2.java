package third_tasks;

//	Даны n пар чисел: [a_1,b_1  a_2,b_2…a_n,b_n]. Определить:
//а) максимальную сумму значений чисел в паре;
//б) минимальное произведение значений чисел в паре.

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество пар чисел:");
        int n = scanner.nextInt();

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите числа a и b для пары " + (i + 1) + ":");
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int minProduct = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];

            int sum = a + b;
            int product = a * b;

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (product < minProduct) {
                minProduct = product;
            }
        }

        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Минимальное произведение: " + minProduct);

    }
}
