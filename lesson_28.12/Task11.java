package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//11.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с заглавной буквы и заканчиваются восклицательным знаком.
public class Task11 {
    public static void main(String[] args) {
        String regex = "^[A-ZА-Я].*!$";
        String[] testStrings = {
                "Hello !!!",
                "привет ",
                "Start123.",
                "Start??/",
                "Привет мир",
                "       ",
                "HelloWorld"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.matches()) {
                System.out.println("Совпадение: \"" + testString + "\"");
            } else {
                System.out.println("Не совпадает: \"" + testString + "\"");
            }
        }
    }
}
