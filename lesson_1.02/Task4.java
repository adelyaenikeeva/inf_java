package info.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//4.	Реализуйте программу, которая принимает на вход слово. Программа должна проверить, встречается ли это слово в тексте,
// и вывести количество его вхождений.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.next();
        int count = 0;

        String fileName = "/Users/adelyaenikeeva/IdeaProjects/inf/src/info/example.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) { // Открываем файл для чтения
            String line; // Для хранения текущей строки
            while ((line = bufferedReader.readLine()) != null) { // Читаем строку за строкой
                String lowerCaseLine = line.toLowerCase();
                String lowerCaseWord = word.toLowerCase();

                // Разбиваем строку на слова и проверяем каждое слово
                String[] words = lowerCaseLine.split("\\s+");
                for (String w : words) {
                    if (w.equals(lowerCaseWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Слово \"" + word + "\" встречается " + count);
        } catch (IOException e) { // Обрабатываем ошибки
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
