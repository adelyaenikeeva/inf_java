package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//8.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с любой буквы (латинский алфавит)
// и заканчиваются знаком вопроса.
public class Task8 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z].*\\?$";

        String[] testStrings = {
                "Hello?",
                "world",
                "aaa123?"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.find()) {
                System.out.println("Совпадение: " + testString);
            } else {
                System.out.println("Не совпадает: " + testString);
            }
        }
    }
}
