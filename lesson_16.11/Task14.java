package second_tasks;

import java.util.Scanner;

//Даны натуральные числа i, n, действительные числа a1...an. Найти среднее арифметическое всех чисел, кроме  a_i.
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n = ");
        int n = scanner.nextInt();

        System.out.printf("Введите i = 0 до %d ", n - 1);
        int i = scanner.nextInt();

        double[] array = new double[n];
        double sum = 0.0;

        for (int j = 0; j < n; j++) {
            array[j] = scanner.nextDouble();
        }

        for (int j = 0; j < n; j++) {
            // исключаем из суммы a_i элемент
            if (j != i) {
                sum += array[j];
            }
        }

//        выводим среднее арифметическое, где общее кол-во элементов n-1
        System.out.println("среднее арифметическое всех чисел, кроме  a_i = " + sum/(n - 1));
    }
}
