package info.classwork;

import java.io.*;

//5.	Напишите код, который считывает содержимое из одного текстового файла и записывает его в другой файл,
// создавая новый файл или перезаписывая существующий.
public class Task5 {
    public static void main(String[] args) {
        String fileName = "/Users/adelyaenikeeva/IdeaProjects/inf/src/info/example.txt";
        String outputFilePath = "output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
//             true - дозапись в файл
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath, true))) { // Оборачиваем FileReader
            String line; // Для хранения текущей строки
            while ((line = bufferedReader.readLine()) != null) { // Читаем строку за строкой
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) { // Обрабатываем ошибки
            System.out.println(e.getMessage());
        }
    }
}
