package SixthTasks;

//23.	Дан текст. Сколько раз в нем встречается символ "+" и сколько раз символ "*"?
public class Task23 {

    public static int countOccurrences(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Hello java";
        char plus = '+';
        char asterisk = '*';

        int plusCount = countOccurrences(text, plus);
        int asteriskCount = countOccurrences(text, asterisk);

        System.out.println("Количество символов '+': " + plusCount);
        System.out.println("Количество символов '*': " + asteriskCount);
    }
}
