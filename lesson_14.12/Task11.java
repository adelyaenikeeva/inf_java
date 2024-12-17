package SixthTasks;

//11.	В заданной строке символов выделить в отдельную строку все имеющиеся цифры.
public class Task11 {
    public static void main(String[] args) {
        String str1 = "Hello Java 123";

        char[] chArr = str1.toCharArray();
        String str2 = "";

        for (char ch : chArr) {
            if (Character.isDigit(ch)) {
                str2 += ch;
            }
        }

        System.out.println(str2);
    }
}
