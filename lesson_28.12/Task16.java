package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//16.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с символа # и заканчиваются словом "done".
public class Task16 {
    public static void main(String[] args) {
        String regex = "^#.*\\s?done$";

        String[] testStrings = {
                "#A123done",
                "#A1 done",
                "789 done",
                "#12.34done",
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
