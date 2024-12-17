package SixthTasks;

//18.	Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1.
public class Task18 {
    public static void main(String[] args) {
        String s1 = "HelloJava";
        String s2 = "";
        int size = s1.length();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) { // Индексация начинается с 0, поэтому нечетные индексы по счёту (1, 3, 5...)
                s2 += s1.charAt(i);
            }
        }

        System.out.println("Исходное слово: " + s1);
        System.out.println("Новое слово: " + s2);
    }
}
