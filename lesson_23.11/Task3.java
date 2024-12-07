package third_tasks;

//	Дана последовательность целых чисел [a_1,a_2…a_n], где n >= 3. Найти:
//а) максимальную сумму чисел двух соседних чисел;
//б) минимальную сумму двух соседних чисел;
//в) порядковые номера двух соседних чисел, сумма которых максимальна.
// Если таких пар чисел несколько, то найти номера чисел первой такой пары;
//г) порядковые номера двух соседних чисел, сумма которых минимальна.
// Если таких пар чисел несколько, то найти номера чисел последней из них.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности (n >= 3): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Ошибка: n должно быть не менее 3.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Введите числа последовательности:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

//      Integer.MIN_VALUE — это наименьшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить максимальное значение).
//      Если в процессе поиска максимальной суммы в массиве мы сравниваем элементы с maxSum,
//      любое значение в нем будет больше Integer.MIN_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым максимумом.
        int maxSum = Integer.MIN_VALUE;

//      Integer.MAX_VALUE — это наибольшее возможное значение типа int,
//      (для инициализации переменной, которая будет хранить минимальное значение).
//      Если в процессе поиска минимальной суммы в массиве мы сравниваем элементы с minSum,
//      любое значение в нем будет меньше Integer.MAX_VALUE.
//      Это гарантирует, что первое значение, с которым мы сравнили, становится новым минимумом.
        int minSum = Integer.MAX_VALUE;
        int maxIndex1 = 0;
        int minIndex1 = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = array[i] + array[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
                maxIndex1 = i;
            }

            if (sum <= minSum) {
                minSum = sum;
                minIndex1 = i;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int sum = array[i] + array[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
                maxIndex1 = i;
            }

            if (sum <= minSum) {
                minSum = sum;
                minIndex1 = i;
            }
        }

        System.out.println("Максимальная сумма двух соседних чисел: " + maxSum);
        System.out.println("Минимальная сумма двух соседних чисел: " + minSum);
        System.out.println("Порядковые номера соседних чисел с максимальной суммой: [" + maxIndex1 + ", " + (maxIndex1 + 1) + "]");
        System.out.println("Порядковые номера соседних чисел с минимальной суммой: [" + minIndex1 + ", " + (minIndex1 + 1) + "]");
    }

}
