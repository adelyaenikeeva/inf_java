package SeventhTasks;

//5.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с числа и заканчиваются словом "end".

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//^ - указывает на начало строки.
//[0-9] - соответствует любому числу от 0 до 9. Это гарантирует, что строка начинается с цифры.
//.* - соответствует нулю или более любым символам (кроме символа новой строки).
//end - соответствует конкретному слову "end".
//$ - указывает на конец строки.
public class Task5 {
    public static void main(String[] args) {
        String regex = "^[0-9].*end$";
        String[] testStrings = {
                "123end",
                "456",
                "789end",
                "12.34end",
                "abc"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String test : testStrings) {
            Matcher matcher = pattern.matcher(test);

            while (matcher.find()) {
                System.out.printf("Строка начинается с числа и заканчивается end %s\n", matcher.group());
            }
        }
    }
}
