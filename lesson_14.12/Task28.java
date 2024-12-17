package SixthTasks;

//Дано предложение. Заменить в нем все вхождения подстроки s1 на подстроку s2.
public class Task28 {
    public static void main(String[] args) {
        String sentence = "Привет, мир! Привет, Java!";
        String s1 = "Привет";
        String s2 = "Здравствуйте";

        String result = sentence.replaceAll(s1, s2);
        System.out.println(result);
    }
}
