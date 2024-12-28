package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//17.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с пробела и заканчиваются на слово "exit".
public class Task17 {
    public static void main(String[] args) {
        String regex = "^\\s.+exit$";

        String[] testStrings = {
                " A123 exit",
                " A1exit",
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
