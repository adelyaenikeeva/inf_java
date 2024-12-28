package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//12.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с любой буквы (латинский алфавит) и заканчиваются словом "done".
public class Task12 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z].*done$";

        String[] testStrings = {
                "A_done",
                "ABc456done",
                "789end!1",
                "12.34done",
                "Abc done"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String test : testStrings) {
            Matcher matcher = pattern.matcher(test);

            while (matcher.find()) {
                System.out.printf("Строка начинается с буквы латинского алфавита и заканчивается done %s\n", matcher.group());
            }
        }
    }
}
