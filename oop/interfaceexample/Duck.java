package eighthtask.oop.interfaceexample;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void swim() {
        System.out.println("Уточка плывет");
    }
}
