package FifthTasks;

import java.util.Arrays;
import java.util.Random;

// Бинарный поиск
public class Task15 {

    public static int[] fillArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            // Если целевой элемент больше, то он находится в правой части
            if (array[mid] < target) {
                left = mid + 1; // Изменяем левую границу
            } else {
                right = mid - 1; // Изменяем правую границу
            }
        }
        return -1;
    }


//    public static int[] bubbleSort(int[] arr) {
//        int n = arr.length;
//        boolean swapped;
//
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false; // Изначально не было обменов
//            // Последние i элементов уже отсортированы, поэтому мы уменьшаем диапазон
//            for (int j = 0; j < n - i - 1; j++) {
//                // Сравниваем соседние элементы
//                if (arr[j] > arr[j + 1]) {
//                    // Меняем их местами, если они находятся в неправильном порядке
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            // Если за проход не произошло ни одного обмена, массив уже отсортирован
//            if (!swapped) {
//                break;
//            }
//        }
//        return arr;
//    }

    public static void main(String[] args) {
        int[] array = fillArray(15);
        printArray(array);

        Arrays.sort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(binarySearch(array, 5));
    }
}
