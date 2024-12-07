package second_tasks;

//11.	Даны натуральные числа n, целые числа a1..an. Получить произведение элементов последовательности, кратных 7.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int multiply = 1;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 7 == 0) {
                multiply *= array[i];
            }
        }

//        %d является спецификатором формата, который указывает, что в этом месте строки будет выведено целое число (тип int).
        System.out.printf("Произведение элементов %d", multiply);

        scanner.close();
    }
}
