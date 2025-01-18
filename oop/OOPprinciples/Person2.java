package eighthtask.oop.OOPprinciples;

//  Инкапсуляция – это сокрытие данных и обеспечение доступа к ним только через определённые методы.
//  Инкапсуляция достигается с помощью модификаторов доступа и методов доступа (геттеров и сеттеров).

//  Модификаторы доступа определяют видимость переменной или метода:
//  private: доступен только внутри класса
//  default (отсутствие модификатора): доступен внутри пакета
//  protected: доступен внутри пакета и для наследников класса (подклассах)
//  public: доступен отовсюду

//  Методы доступа (геттеры и сеттеры) позволяют получать и изменять значения закрытых полей класса.

public class Person2 {
    // инкапсуляция данных
    // Закрытые (private) поля — их нельзя напрямую изменить извне
    private String name;
    private int age;

//    public Person2(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public Person2(String name, int age) {
        setName(name);
        setAge(age);
    }

    //    перегрузка конструктора
    public Person2(int age) {
        this.name = "Unknown";
        setAge(age);
    }

//    public Person2(int age) {
//        this.name = "Unknown";
//        this.age = age;
//    }

//    перегрузка конструктора
    public Person2(String name) {
        this.name = name;
    }

    // Публичный геттер для получения значения поля name
    public String getName() {
        return name;
    }

    // Публичный сеттер для установки значения поля name
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

//    сеттер с проверкой устанавливаемого значения
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }


    public void speak() {
        System.out.println("Привет, меня зовут " + name);
    }
    
    public void speak(String hobby) {
        System.out.println("Привет, меня зовут " + name + ". Я увлекаюсь " + hobby + ".");
    }

    public String displayInfo() {
        return "это класс Person2";
    }
}

