package SeventhTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3.	Создайте регулярное выражение, которое выбирает самое длинное слово в строке.

//\\b обозначает границу слова. Это означает, что поиск будет начинаться и заканчиваться на границах слов.
//\\w+ используется для нахождения последовательности из одной или более букв, цифр или символов подчеркивания.
// В контексте поиска слова символ \\w соответствует любому алфавитно-цифровому символу,
// а + указывает на то, что этот символ должен повторяться один или более раз.
public class Task3 {
    public static void main(String[] args) {
        String regex = "\\b\\w+\\b";

        String text = "Hello World! The largest world";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String longestWord = "";

        while (matcher.find()) {
            String currentWord = matcher.group();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        System.out.println(longestWord);
    }
}
