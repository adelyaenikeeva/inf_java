package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//15.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с буквы, за которой следует одно или более чисел, и заканчиваются на слово "complete".
public class Task15 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][0-9]+.?complete$";

        String[] testStrings = {
                "A123complete",
                "A1 complete",
                "789end!1",
                "12.34done",
                "Hello there !"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String test : testStrings) {
            Matcher matcher = pattern.matcher(test);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
