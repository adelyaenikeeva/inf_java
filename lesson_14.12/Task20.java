package SixthTasks;

import java.util.Scanner;

//20.	Дано слово. Добавить к нему в начале четыре символа "+" и в конце — пять символов "–".
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        String modifiedWord = "++++" + word + "-----";

        System.out.println("Новое слово: " + modifiedWord);

        scanner.close();
    }
}
