package eighthtask.oop.interfaceexample;

public abstract class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
