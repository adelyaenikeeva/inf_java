package eighthtask.task2;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("Name", 20, "address");
        System.out.println(person);

        person.setAge(30);
        person.setAddress("NEW address");
        System.out.println(person);

        System.out.println(person.getName());
    }
}
