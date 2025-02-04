package info.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//14.	Напишите регулярное выражение для проверки, содержится ли в строке почтовый адрес.
// Например, example@mail.ru или user42@gmail.com.
// Учтите, что доменные части могут включать точки, а названия почт могут состоять из букв, цифр, точек и знака подчеркивания.
public class Task14 {
    public static void main(String[] args) {
        String emailPattern = "[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String testString = "Это пример текста с почтовым адресом user42@gmail.com";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(testString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
