package SixthTasks;

//Дано предложение. Заменить в нем все вхождения буквосочетания да на не.
public class Task27 {
    public static void main(String[] args) {
        String sentence = "Да будет так!".toLowerCase();
        String s1 = "да";
        String s2 = "нет";

        // Замена
        String modifiedSentence = sentence.replace(s1, s2);

        System.out.println(modifiedSentence);
    }
}
