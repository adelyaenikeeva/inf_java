package eighthtask.oop.maininfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("ПРИМЕР КЛАССА");
        Person person = new Person("Name", 20);
        Person person2 = new Person(20);
        Person person3 = new Person("Name");

//        поскольку name имеет модификатор доступа final, оно не может быть изменено
//        person.name = "Name2";
        person.age = -30;

        person.displayInfo();
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("count = " + Person.getCount());

//        ПРИМЕРЫ ПЕРЕГРУЗКИ МЕТОДОВ
        person.speak();
        person.speak("Hobby");
        person.speak(2, "Profession");

        person.displayInfo();
    }
}
