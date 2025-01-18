package eighthtask.oop.interfaceexample;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Duck Name");
        System.out.println(duck);
        duck.fly();
        duck.land();
        duck.swim();

        Airplane airplane = new Airplane();
        airplane.fly();
        airplane.land();

        Person person = new Person();
        person.swim();
    }
}
