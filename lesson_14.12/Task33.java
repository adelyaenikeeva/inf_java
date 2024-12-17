package SixthTasks;

import java.util.Scanner;

//Дано предложение из 10 слов. Заполнить ими массив из 10 элементов.
public class Task33 {
    public static void main(String[] args) {
        String[] words = new String[10];
        String input = "Это пример предложения из 10 слов, чтобы заполнить ими массив";

        // Разбиваем введенное предложение на слова
        String[] inputWords = input.split(" ");

        if (inputWords.length != 10) {
            System.out.println("Предложение должно содержать ровно 10 слов.");
            return;
        }

        for (int i = 0; i < inputWords.length; i++) {
            words[i] = inputWords[i];
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
