package info.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//3.	Программа должна прочитать текстовый файл построчно и выводить его содержимое в консоль, добавляя номер перед каждой строкой.
public class Task3 {
    public static void main(String[] args) {
        String fileName = "/Users/adelyaenikeeva/IdeaProjects/inf/src/info/example.txt";
        int lineCount = 1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) { // Оборачиваем FileReader
            String line; // Для хранения текущей строки
            while ((line = bufferedReader.readLine()) != null) { // Читаем строку за строкой
                System.out.println(lineCount + " " + line); // Вывод каждой строки
                lineCount++;
            }
        } catch (IOException e) { // Обрабатываем ошибки
            System.out.println(e.getMessage());
        }
    }
}
