package SixthTasks;

import java.util.Scanner;

//Дано слово из 15-ти букв. Переставить в обратном порядке буквы,
// расположенные между k-й и s-й буквами (т. е. с (k + 1)-й по (s – 1)-ю). Значения k и s вводятся с клавиатуры, k < s.
public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово из 15 букв: ");
        String word = scanner.nextLine();

        if (word.length() != 15) {
            System.out.println("Ошибка: слово должно быть длиной 15 букв.");
            return;
        }

        System.out.print("Введите k (0 <= k < 15): ");
        int k = scanner.nextInt();
        System.out.print("Введите s (k < s <= 15): ");
        int s = scanner.nextInt();

        if (k < 0 || k >= 15 || s <= k || s > 15) {
            System.out.println("Ошибка: некорректные значения k и s.");
            return;
        }

        char[] chars = word.toCharArray();

        // Переворачиваем буквы между (k+1) и (s-1)
        for (int i = k + 1, j = s - 1; i < j; i++, j--) {
            // Меняем местами элементы
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // Преобразуем массив символов обратно в строку
        String reversedWord = new String(chars);

        System.out.println("Результат: " + reversedWord);
    }
}
