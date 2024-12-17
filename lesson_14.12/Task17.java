package SixthTasks;

import java.util.Scanner;

//17.	Составить программу, которая печатает заданное слово, начиная с последней буквы.
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        String reversedWord = "";

        int size = word.length() - 1;
        // Перебираем буквы слова с конца до начала
        for (int i = size; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Перевернутое слово: " + reversedWord);

        scanner.close();
    }
}
