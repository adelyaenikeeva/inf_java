package SixthTasks;

//Даны два предложения. Для каждого слова первого предложения (в том числе для повторяющихся в этом предложении слов)
// определить, входит ли оно во второе предложение.
public class Task34 {

    public static boolean isWordInSecondSentence(String word, String[] secondWords) {
        for (String secondWord : secondWords) {
            if (word.equals(secondWord)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String firstSentence = "Hello java".toLowerCase();
        String secondSentence = "Java 123".toLowerCase();

        String[] secondWords = secondSentence.split(" ");

        String[] firstWords = firstSentence.split(" ");
        for (String word : firstWords) {
            if (isWordInSecondSentence(word, secondWords)) {
                System.out.println(word + " присутствует во втором предложении");
            } else {
                System.out.println(word + " отсутствует во втором предложении");
            }
        }

    }
}
