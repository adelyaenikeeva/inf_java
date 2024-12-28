package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//19.	Напишите регулярное выражение, которое совпадает со всеми строками, содержащими хотя бы одну прописную букву английского алфавита.
public class Task19 {
    public static void main(String[] args) {
        String regex = ".*[A-Z]+.*";

        String[] testStrings = {
                " A123",
                "123",
                "a ",
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
