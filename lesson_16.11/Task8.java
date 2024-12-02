package second_tasks;

import java.util.Scanner;

//8.	Локальным максимумом в последовательности назовем элемент,
// который больше предыдущего и следующего (если они есть).
// Проверить, что во входной последовательности существует четный по значению локальный максимум.
// Элемент называется локальным максимумом, когда он строго больше своих соседей (a_i > a_(i - 1) и a_i > a_(i + 1)).
// Так как у a_1 и a_n есть только по одному соседу, они не являются ни локальными минимумами, ни локальными максимумами.

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Последовательность должна содержать как минимум 3 элемента.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean evenLocalMaxFound = false;

//        Идем от второго до предпоследнего элемента (так как у первого и последнего элементов только по одному соседу)
        for (int i = 1; i < n - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1] && array[i] % 2 == 0) {
                    evenLocalMaxFound = true;
                    System.out.println("Найден четный локальный максимум: " + array[i]);
                    break;
            }
        }

        if (!evenLocalMaxFound) {
            System.out.println("Четный локальный максимум не найден.");
        }

        scanner.close();
    }
}
