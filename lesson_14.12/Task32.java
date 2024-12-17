package SixthTasks;

import java.util.Scanner;

//Даны два слова. Для каждой буквы первого слова (в том числе для повторяющихся в этом слове букв)
// определить, входит ли она во второе слово.
//Например, если заданные слова информация и процессор, то для букв первого из них ответом должно быть:
// нет нет нет да да нет нет да нет нет.
public class Task32 {
    public static void main(String[] args) {
        String word1 = "информация";
        String word2 = "процессор";

        String result = "";

        // Проверяем каждую букву первого слова
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            // Если буква содержится во втором слове, добавляем "да", иначе "нет"
            if (word2.indexOf(c) != -1) {
                result += "да ";
            } else {
                result += "нет ";
            }
        }
        // Удаляем последний пробел и выводим результат
        result = result.trim();
        System.out.println(result);
    }
}
