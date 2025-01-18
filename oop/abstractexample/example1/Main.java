package eighthtask.oop.abstractexample.example1;

public class Main {
    public static void main(String[] args) {
//        нельзя создать экземпляр абстрактного класса
//        Shape shape = new Shape();

        try {
            System.out.println("RECTANGLE");
            Rectangle rectangle = new Rectangle(4.0, 5.0);
            System.out.printf("Rectangle area = %.0f", rectangle.area());
            System.out.printf("\nRectangle perimeter = %.0f\n", rectangle.perimeter());

            System.out.println("\nCIRCLE");
            Circle circle = new Circle(3.2);
            System.out.printf("Circle area = %.2f", circle.area());
            System.out.printf("\nCircle perimeter = %.2f", circle.perimeter());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
