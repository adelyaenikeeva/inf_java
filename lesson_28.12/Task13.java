package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//13.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с фразы "Hello there" и заканчиваются знаком восклицания.
public class Task13 {
    public static void main(String[] args) {
        String regex = "^Hello there.*!$";

        String[] testStrings = {
                "Hello there _done!!!",
                "ABc456done",
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
