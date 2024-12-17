package SixthTasks;

import java.util.Scanner;

//2.	Дано два слова. Определить, какое из них длиннее.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        if (str1.length() > str2.length()) {
            System.out.println("Первое слово длиннее");
        } else {
            System.out.println("Второе слово длиннее");
        }

        scanner.close();
    }
}
