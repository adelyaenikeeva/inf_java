package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.	Напишите регулярное выражение, которое совпадает со всеми строками, содержащими хотя бы одну цифру.

//.* означает "любое количество любых символов (включая ноль)".
//\\d соответствует любой цифровой символ (0-9).
//.* снова означает "любое количество любых символов (включая ноль)", что позволяет цифре находиться в любой позиции строки.
public class Task1 {
    public static void main(String[] args) {
        String regex = ".*\\d.*";
        Pattern pattern = Pattern.compile(regex);

        String[] testStrings = {
                "Hello World",
                "Hello World 123",
                "Java 8 is great!"
        };

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.find()) {
                System.out.printf("%s содержит хотя бы одну цифру\n", testString);
            } else {
                System.out.printf("%s не содержит цифр\n", testString);
            }
        }
    }
}
