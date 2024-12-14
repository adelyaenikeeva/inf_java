package FifthTasks;

import java.util.Random;

//Линейный поиск
public class Task14 {

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

    public static int linearSearch(int[] array, int target) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] result = fillArray(5);
        printArray(result);
        System.out.println("\n" + linearSearch(result, 4));
    }
}
