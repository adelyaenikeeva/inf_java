package SixthTasks;

import java.util.Scanner;

//3.	Даны названия трех городов. Вывести на экран самое длинное и самое короткое название.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название первого города:");
        String city1 = scanner.nextLine();
        System.out.println("Введите название второго города:");
        String city2 = scanner.nextLine();
        System.out.println("Введите название третьего города:");
        String city3 = scanner.nextLine();

        String longestCity = city1;
        String shortestCity = city1;

        if (city2.length() > longestCity.length()) {
            longestCity = city2;
        }
        if (city2.length() < shortestCity.length()) {
            shortestCity = city2;
        }

        if (city3.length() > longestCity.length()) {
            longestCity = city3;
        }
        if (city3.length() < shortestCity.length()) {
            shortestCity = city3;
        }

        if (city1.length() == city2.length() && city1.length() == city3.length()) {
            System.out.println("Названия городов равны");
        } else {
            System.out.println("Самое длинное название: " + longestCity);
            System.out.println("Самое короткое название: " + shortestCity);
        }

        scanner.close();
    }
}
