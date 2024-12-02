package second_tasks;

import java.util.Scanner;

//Дано действительное число а, натуральное число n. Вычислить:
//a) a^n;
//б) a(a+1)...(a+n-1)
//в) 1/a + 1/(a(a+1)) + ... + 1/(a(a+1)...(a+n))

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();

//        a)
        double powerResult = Math.pow(a, n);
        System.out.println(powerResult);

//        б)
        double productResult = 1.0;
        for (int i = 0; i < n; i++) {
            productResult *= a + i;
        }

        System.out.println(productResult);

//        г) 1/a + 1/(a(a+1)) + ... + 1/(a(a+1)...(a+n))
//        инициализируем sum = 1/a (первым членом ряда)
        double sum = 1.0/a;
        double product = 1.0;

        for (int i = 1; i <= n; i++) {
            product *= a + i;
            sum += 1.0 / product;
        }

//        г) 1/a + 1/(a(a+1)) + ... + 1/(a(a+1)...(a+n))
//        или можно так:
//        Инициализируем с нуля
//        double sum = 0.0;
//        double product = 1.0;
//
//        for (int i = 0; i <= n; i++) {
//            product *= a + i;
//            sum += 1.0/product;
//        }

        System.out.println("Сумма: " + sum);

        scanner.close();
    }
}
