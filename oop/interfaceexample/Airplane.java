package eighthtask.oop.interfaceexample;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
