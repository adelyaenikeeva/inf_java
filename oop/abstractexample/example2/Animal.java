package eighthtask.oop.abstractexample.example2;

public abstract class Animal {
    public static String type = "Animal Class";

    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public Animal() {
        this("Unknown", 0);
    }

    public static String getType(){
        return type;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
