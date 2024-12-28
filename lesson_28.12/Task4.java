package SeventhTasks;

//4.	Напишите регулярное выражение, которое проверяет, является ли строка целым числом.
// Например, строки "123", "-456", "+789" должны быть признаны корректными, а "12.34" или "abc" - нет.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//[+-]? — это часть, которая позволяет строке начинаться с символа + или -, или не иметь знака вообще.
// Знак ? означает, что предыдущий символ может появляться 0 или 1 раз.
//\\d+ — это соответствует одной или более цифрам. Символ \\d представляет любую цифру (от 0 до 9),
// а + говорит о том, что хотя бы одна цифра обязательна.
public class Task4 {
    public static void main(String[] args) {
        String regex = "^[+-]?\\d+$";

        String[] testStrings = {
                "123",
                "-456",
                "+789",
                "12.34",
                "abc"
        };

        for (String s : testStrings) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println(s + " соответствует регулярному выражению");
            } else {
                System.out.println(s + " не соответствует регулярному выражению");
            }
        }
    }
}
