package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10.	Напишите регулярное выражение, чтобы выбрать строки, которые содержат только буквы и пробелы.

//^ - означает начало строки.
//[a-zA-Zа-яА-ЯёЁ\\s] - класс символов, который включает:
//a-z – английские строчные буквы,
//A-Z – английские прописные буквы,
//а-я – русские строчные буквы,
//А-Я – русские прописные буквы,
//ёЁ – русские буквы "ё" и "Ё",
//\\s – пробел (и другие пробельные символы, такие как табуляция).
//+ - означает, что предыдущий элемент (в данном случае класс символов) должен встречаться один или более раз.
//$ - означает конец строки.
public class Task10 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Zа-яА-ЯёЁ\\s]+$";
        String[] testStrings = {
                "Hello ",
                "Привет ",
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
