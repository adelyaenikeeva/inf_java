package ninethexample.classwork.task5;

//Создайте базовый класс Animal, который будет иметь атрибуты name (имя) и age(возраст).
// Затем создайте два дочерних класса: Dog и Cat.
//        Требования:
//В классе Animal добавьте метод speak(), который возвращает строку с общим звуком животного (например, "Some sound").
//В классе Dog переопределите метод speak() так, чтобы он возвращал "Woof!" и добавьте новый атрибут breed (порода).
//В классе Cat переопределите метод speak() так, чтобы он возвращал "Meow!" и добавьте новый атрибут color (цвет).
//В методе Main создайте массив из объектов дочерних классов с восходящим преобразованием до родительского класса.
// Затем покажите работу полиморфизма на примере переопределенных методов.

public class Animal {
    private String name;
    private int age;

    public Animal(int age, String name) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
        this.age = age;
    }

    public void speak() {
        System.out.println("Some sound");
    }
}
