package SeventhTasks;

//5.	Напишите регулярное выражение, чтобы выбрать строки, которые начинаются с числа и заканчиваются словом "end".

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//\\d — Соответствует любой цифре от 0 до 9. Это означает, что строка должна начинаться с числа.
//.* — Соответствует нулю или более любым символам. Точка . означает «любой символ» (кроме перевода строки),
// а звездочка * делает этот символ «необязательным», позволяя присутствовать любому количеству символов между цифрой и словом "end".
//end — Указывает, что строка должна содержать слово "end" в конце.
public class Task5 {
    public static void main(String[] args) {
        String regex = "\\d.*end";
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
