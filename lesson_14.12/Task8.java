package SixthTasks;

//8.	Дано слово. Получить и вывести на экран буквосочетание, состоящее из его второго и четвертого символа.
public class Task8 {
    public static void main(String[] args) {
        String word = "Hello";
        char secondCh = word.charAt(1);
        char fourthCh = word.charAt(3);

        String combination = "" + secondCh + fourthCh;
        System.out.println(combination);
    }
}
