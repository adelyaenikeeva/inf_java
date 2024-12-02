package third_tasks;

//Дан массив. Поменять местами:
//а) второй и пятый элементы;
//б) m-й и n-й элементы;
//в) третий и максимальный элементы.
// Если элементов с максимальным значением несколько, то в обмене должен участвовать первый из них;
//г) первый и минимальный элементы.
// Если элементов с минимальным значением несколько, то в обмене должен участвовать последний из них.

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 6;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // а) Поменять местами второй и пятый элементы
        int temp = array[1];
        array[1] = array[4];
        array[4] = temp;

        System.out.println("После замены а):");
        System.out.println(Arrays.toString(array));

        // б) Поменять местами m-й и n-й элементы
        int m = 2;
        int n = 5;
        temp = array[m];
        array[m] = array[n];
        array[n] = temp;

        System.out.println("После замены б):");
        System.out.println(Arrays.toString(array));

        // в) Поменять местами третий и максимальный элементы
        int maxIndex = 0;
        for (int i = 1; i < length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        temp = array[2];
        array[2] = array[maxIndex];
        array[maxIndex] = temp;

        // Вывод массива после замены пункт в)
        System.out.println("После замены в):");
        System.out.println(Arrays.toString(array));

        // г) Поменять местами первый и минимальный элементы
        int minIndex = 0;
        for (int i = 1; i < length; i++) {
            if (array[i] <= array[minIndex]) {
                minIndex = i;
            }
        }
        temp = array[0];
        array[0] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("После замены г):");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
}
