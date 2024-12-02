package second_tasks;

//10.	Даны натуральное число n, действительные числа a1..an.
// Получить удвоенную сумму всех положительных элементов последовательности.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] array = new double[n];
        double sum = 0;

        //      вводим элементы массива и сразу проверяем условие
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
            if (array[i] > 0) {
                sum += array[i];
            }
        }

//        %.0f означает, что число будет выведено как число с плавающей запятой (float или double),
//        при этом 0 указывает на то, что после запятой не будет отображаться ни одной цифры.
        System.out.printf("Удвоенная сумма = %.0f", sum * 2);

        scanner.close();
    }
}
