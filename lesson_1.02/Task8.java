package info.classwork;

import java.util.Scanner;

//8.	Реализуйте программу, которая принимает два числа от пользователя. При попытке деления на ноль программа должна
// обрабатывать исключение и показывать пользователю сообщение об ошибке.
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        try {
            double result = a / b;
            System.out.printf("Результат: %f", result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
