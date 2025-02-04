package info.classwork;

import java.util.Scanner;

//12.	Создайте собственное исключение NegativeNumberException. Напишите программу, которая вызывает это исключение,
// если пользователь вводит отрицательное число.
class NegativeNumberException extends Exception {
    // Конструктор пользовательского исключения
    public NegativeNumberException(String message) {
        super(message); // Передаём сообщение в базовый класс Exception
    }
}
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        try {
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Отрицательное число");
            }

            System.out.printf("Введенное число: %d", number);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
