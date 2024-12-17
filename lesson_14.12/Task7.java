package SixthTasks;

//7.	Даны два слова. Верно ли, что первое слово начинается на ту же букву, на которую заканчивается второе слово?
public class Task7 {
    public static void main(String[] args) {
        String word1 = "Hello".toLowerCase();
        String word2 = "Java".toLowerCase();

        char firstWord = word1.charAt(0);
        char lastWord = word2.charAt(word2.length() - 1);

        System.out.println(firstWord == lastWord);
    }
}
