package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//18.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с маленькой буквы и заканчиваются на слово "done".
public class Task18 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z].*done$";

        String[] testStrings = {
                "a123 done",
                "A1 done",
                "A exit",
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
