package second_tasks;

import java.util.Scanner;
//        9.	Даны натуральные числа n, целые числа a1..an.
//        Найти количество и сумму элементов последовательности,
//        которые делятся на 5 и не делятся на 7.

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        int sum = 0;
        int count = 0;

        System.out.println("Введите элементы массива");
//      вводим элементы массива и сразу проверяем условие
        for (int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
            if (array[i] % 5 == 0 && array[i] % 7 != 0){
                sum += array[i];
                count++;
            }
        }

        System.out.println("Количество = " + count);
        System.out.println("Сумма = " + sum);

        scanner.close();
    }
}
