package eighthtask.oop.abstractexample.example1;

//  Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
//  Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Double width, Double height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle() {
        this(4.0, 4.0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < this.width) {
//          IllegalArgumentException: использование неверного аргумента при вызове метода
            throw new IllegalArgumentException("Ширина не может быть отрицательной");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < this.height) {
//          IllegalArgumentException: использование неверного аргумента при вызове метода
            throw new IllegalArgumentException("Высота не может быть отрицательной");
        }
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width * height);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
