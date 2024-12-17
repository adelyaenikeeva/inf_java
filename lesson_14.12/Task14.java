package SixthTasks;

//14.	Из слова вирус путем замены его букв получить слово фокус
public class Task14 {
    public static void main(String[] args) {
        String input = "вирус";
        String firstHalf = input.substring(0, 3)
                .replace('в', 'ф')
                .replace('и', 'о')
                .replace('р', 'к');
        String secondHalf = input.substring(3);

        String newWord = firstHalf + secondHalf;
//        или можно так
//        String newWord = firstHalf.concat(secondHalf);
        System.out.println("Исходное слово: " + input);
        System.out.println("Слово после замены: " + newWord);

    }
}
