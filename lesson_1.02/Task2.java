package info.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//2.	Создайте программу, которая считает количество строк в текстовом файле и выводит результат в консоль.
public class Task2 {
    public static void main(String[] args) {
        String fileName = "/Users/adelyaenikeeva/IdeaProjects/inf/src/info/example.txt";
        int lineCount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) { // Оборачиваем FileReader
            while ((bufferedReader.readLine()) != null) { // Читаем строку за строкой
                lineCount++;
            }
            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) { // Обрабатываем ошибки
            System.out.println(e.getMessage());
        }
    }
}
