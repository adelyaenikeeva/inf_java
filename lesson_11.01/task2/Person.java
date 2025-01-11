package eighthtask.task2;

//2.	Создайте класс "Человек" с приватными полями для хранения имени, возраста и адреса.
// Реализуйте методы, которые позволяют изменять адрес и возраст, но не имя. Добавьте метод для вывода полной информации о человеке.
public class Person {
    private final String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        setAge(age);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 110) {
            return;
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
