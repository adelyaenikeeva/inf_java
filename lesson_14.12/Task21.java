package SixthTasks;

import java.util.Scanner;

//21.	Дано предложение. Составить программу, которая выводит все вхождения в предложение двух заданных символов.
public class Task21 {

    private static void findOccurrences(String sentence, char firstChar, char secondChar) {
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == firstChar || currentChar == secondChar) {
                System.out.println("Символ '" + currentChar + "' найден: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();

        System.out.print("Введите первый символ: ");
        char firstChar = scanner.next().charAt(0);
        System.out.print("Введите второй символ: ");
        char secondChar = scanner.next().charAt(0);

        System.out.println("Вхождения символов в предложении:");
        findOccurrences(sentence, firstChar, secondChar);

        scanner.close();
    }
}
