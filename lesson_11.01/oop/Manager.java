package eighthtask.oop;

// Подкласс Manager
public class Manager extends Person2 {
    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public String displayInfo() {
        return "это класс Manager";
    }
}
