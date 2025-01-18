package eighthtask.oop.staticexample;

public class Calculator {
//    double a;
//    double b;
//
//    public Calculator(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public double sum(double c) {
//        return a + b + c;
//    }

//    пример явного преобразования (сужающее преобразование)
    public static int sum(double a, double b) {
        return (int) (a + b);
//        System.out.println(a+b);
    }

//    пример явного преобразования (сужающее преобразование)
    public static int sum(int a, double b) {
        return a + (int) b;
    }

//    пример автоматического преобразования (расширяющее преобразование)
    public static double sum(double a, int b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b < 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a/b;
    }
}
