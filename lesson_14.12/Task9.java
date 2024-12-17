package SixthTasks;

//9.	Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
public class Task9 {
    public static void main(String[] args) {
        String str1 = "Java";
        int length = str1.length();

        if (length % 2 == 0) {
            String firstHalf = str1.substring(0, length / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("Нечетное число букв");
        }
    }
}
