package info.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//9.	Напишите программу, которая читает файл. Если файл не найден, программа должна выводить сообщение об ошибке
// и просить пользователя указать другой путь.
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите путь до файла: ");
            String fileName = scanner.next();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                String line; // Для хранения текущей строки
                while ((line = bufferedReader.readLine()) != null) { // Читаем строку за строкой
                    System.out.println(line); // Вывод каждой строки
                }
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Введите правильный путь до файла!");
            }
        }

        scanner.close();
    }
}
