package SixthTasks;

import java.util.Scanner;

//19.	Составить программу, формирующую строку, состоящую из любого заданного количества любых одинаковых символов.
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Введите количество повторений: ");
        int count = scanner.nextInt();

        if (count < 0) {
            System.out.println("Количество повторений должно быть неотрицательным.");
        } else {
            String result = "";
            for (int i = 0; i < count; i++) {
                result += symbol;
            }

            System.out.println("Результирующая строка: " + result);
        }

        scanner.close();
    }
}
