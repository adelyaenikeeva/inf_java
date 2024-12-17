package SixthTasks;

import java.util.Scanner;

//Дано название города. Определить, четно или нет количество символов в нем.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCity = scanner.nextLine();

        int length = inputCity.length();
        boolean isEven = length % 2 == 0;

        System.out.println(isEven);

        scanner.close();
    }
}
