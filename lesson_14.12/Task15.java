package SixthTasks;

//15.	Дано слово. Перенести первые k его букв в конец.
//Задачу решить двумя способами:
//        1) без использования оператора цикла;
//2) с использованием оператора цикла.

public class Task15 {
    public static void main(String[] args) {
        String word = "HelloJava";
        int k = 3;

        String result = word.substring(k).concat(word.substring(0, k));

        System.out.println("Результат без использования оператора цикла: " + result);

        String result2 = ""; // Строка для хранения результата
        int size = word.length();

        // Добавление символов начиная с k
        for (int i = k; i < size; i++) {
            result2 += word.charAt(i);
        }

        // Добавление первых k символов
        for (int i = 0; i < k; i++) {
            result2 += word.charAt(i);
        }

        System.out.println("Результат с использованием оператора цикла: " + result2);
    }
}
