package second_tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double result;

//        a)
        if (-2 <= a && a < 2) {
            result = a * a;
        } else {
            result = 4;
        }

        System.out.println(result);

//        б)
        if (a <= 2) {
            result = a * a + 4 * a + 5;
        } else {
            result = 1/(a * a + 4 * a + 5);
        }

        System.out.println(result);

        scanner.close();
    }
}
