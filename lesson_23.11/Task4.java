package third_tasks;

//4.	Дан набор ненулевых целых чисел. Признак его завершения - число 0.
// Вывести сумму всех положительных четных чисел из данного набора. Если требуемые числа отсутствуют, то вывести 0.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0 && number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
