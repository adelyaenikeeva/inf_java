package info.classwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1.	Напишите программу, которая принимает путь к файлу, читает все строки файла и выводит их в консоль.
public class Task1 {
    public static void main(String[] args) {
//        System.out.println("Текущая рабочая директория: " + System.getProperty("user.dir"));
        String fileName = "/Users/adelyaenikeeva/IdeaProjects/inf/src/info/example.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) { // Оборачиваем FileReader
            String line; // Для хранения текущей строки
            while ((line = bufferedReader.readLine()) != null) { // Читаем строку за строкой
                System.out.println(line); // Вывод каждой строки
            }
        } catch (IOException e) { // Обрабатываем ошибки
            System.out.println(e.getMessage());
        }

    }
}
