package SixthTasks;

import java.util.Scanner;

//Дано предложение. Напечатать все его символы, предшествующие первой запятой. Рассмотреть два случая:
//1) известно, что в предложении запятые имеются;
//2) в предложении запятых может не быть.
public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();

        // Находим индекс первой запятой
        int commaIndex = sentence.indexOf(',');

        if (commaIndex != -1) {
            // Если запятая найдена, выводим символы до нее
            String result = sentence.substring(0, commaIndex);
            System.out.println("Символы до первой запятой: " + result);
        } else {
            System.out.println("Запятая не найдена");
        }

        scanner.close();
    }
}
