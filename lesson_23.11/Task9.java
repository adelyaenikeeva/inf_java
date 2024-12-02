package third_tasks;

//Дан массив. Сравнить первый и второй элементы массива.
// Если второй элемент меньше первого, то поменять их местами.
// Затем то же самое сделать со вторым и третьим, …, предпоследним и последним элементами.
// Какое число окажется в результате в последнем элементе массива? (сортировка пузырьком)

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Последний элемент массива: " + array[n - 1]);

        scanner.close();

    }
}
