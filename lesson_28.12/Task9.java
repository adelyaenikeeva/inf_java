package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//9.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются со слова "Start" (регистр имеет значение) и заканчиваются точкой.
public class Task9 {
    public static void main(String[] args) {
        String regex = "^Start.*\\.$";

        String[] testStrings = {
                "Hello?",
                "Start123.",
                "Start??/"
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
