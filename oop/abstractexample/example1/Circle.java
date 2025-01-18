package eighthtask.oop.abstractexample.example1;

//  Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
//  Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
public class Circle extends Shape {
    private static final double PI = 3.14;
    private final Double radius;

    public Circle(Double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a circle");
    }
}
