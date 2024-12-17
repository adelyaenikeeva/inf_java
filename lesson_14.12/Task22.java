package SixthTasks;

//22.	Дано предложение. Вывести все имеющиеся в нем буквосочетания нн.
public class Task22 {
    public static void main(String[] args) {
        String sentence = "Предложение с буквосочетаниями нн";

        char[] characters = sentence.toCharArray();
        int count = 0;

        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == 'н' && characters[i + 1] == 'н') {
                System.out.println("Найдено сочетание 'нн': " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Сочетания 'нн' не найдены.");
        }
    }
}
