package eighthtask.task3;

//3.	Класс "Автомобиль": Создайте класс Автомобиль с закрытыми полями для марки, модели и скорости.
// Установите методы доступа и модификации, где скорость не может быть меньше 0 и больше 200 км/ч.
// Реализуйте методы, которые позволяют изменять скорость, но не модель и марку.
public class Auto {
    private final String brand;
    private final String model;
    private int speed;

    public Auto(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 240) {
            System.out.println("error");
            return;
        }
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
