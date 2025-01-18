package eighthtask.oop.staticexample;

public class Calculator {

//    пример явного преобразования (сужающее преобразование)
    public static int sum(double a, double b) {
        return (int) (a + b);
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
//            ArithmeticException: исключение, возникающее при делении на ноль
            throw new ArithmeticException("Деление на ноль");
        }
        return a/b;
    }
}
