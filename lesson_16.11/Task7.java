package second_tasks;

//7.	Ввести целые числа a и b и действительное число z.
// Преобразовать число z по формуле z * x,
// если a делиться на b без остатка и z/x в противном случае (где х – остаток от деления a на b).

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double z = scanner.nextDouble();

        int x = a % b;

        if (x == 0) {
            z *= x;
        } else {
            z /= x;
        }

//        или можно записать с помощью тернарного оператора
//        z = (x == 0) ? (z * x) : (z / x);

        System.out.println(z);

        scanner.close();
    }
}
