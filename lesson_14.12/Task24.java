package SixthTasks;

//24.	Дано предложение. Определить:
//а) число вхождений в него буквосочетания ро;
//б) число вхождений в него некоторого буквосочетания из двух букв;
//в) число вхождений в него некоторого буквосочетания.

public class Task24 {
    public static void main(String[] args) {
        String sentence = "Пример предложения для подсчёта ро и других сочетаний.";

        String substring1 = "ро";
        int count1 = countOccurrences(sentence, substring1);
        System.out.println("Число вхождений \"" + substring1 + "\": " + count1);

        String substring2 = "дл";
        int count2 = countOccurrences(sentence, substring2);
        System.out.println("Число вхождений \"" + substring2 + "\": " + count2);

        String substring3 = "пред";
        int count3 = countOccurrences(sentence, substring3);
        System.out.println("Число вхождений \"" + substring3 + "\": " + count3);
    }

    public static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;

        // Используем метод indexOf для поиска подстроки
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Перемещаем индекс, чтобы избежать бесконечного цикла
        }
        return count;
    }
}
