package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//7.	Напишите регулярное выражение, чтобы выбрать строки, которые содержат более 5 символов и заканчиваются знаком "?".

//.{6,} — соответствует любой последовательности символов длиной не менее 6 символов.
// Здесь . обозначает любой символ, а {6,} указывает на то, что необходимо хотя бы 6 символов.
//\\? — соответствует символу ?. Мы экранируем знак вопроса с помощью двойной обратной косой черты,
// так как он является специальным символом в регулярных выражениях.
public class Task7 {
    public static void main(String[] args) {
        String regex = ".{6,}\\?$";

        String[] testStrings = {
                "Какой вопрос?",
                "Не подходит",
                "123"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.find()) {
                System.out.println("Совпадение: " + testString);
            } else {
                System.out.println("Не совпадает: " + testString);
            }
        }
    }
}

