package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//14.	Напишите регулярное выражение, чтобы выбрать строки, состоящие исключительно из цифр и заканчивающиеся словом "done".
public class Task14 {
    public static void main(String[] args) {
        String regex = "^[0-9]+done$";

        String[] testStrings = {
                "123done",
                "456 done",
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
