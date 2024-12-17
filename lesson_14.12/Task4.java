package SixthTasks;

import java.util.Scanner;

//4.	Дано слово. Вывести на экран его k-й символ
public class Task4 {
    public static void main(String[] args) {
        String str1 = "Hello";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс символа (0-" + (str1.length() - 1) + "): ");

        int k = scanner.nextInt();

        if (k < 0 || k >= str1.length()) {
            System.out.println("Индекс выходит за пределы строки.");
        } else {
            System.out.println(k + ": " + str1.charAt(k));
        }

        scanner.close();
    }
}
