package eighthtask.oop.abstractexample.example2;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("Dog Name", 5, "Корги");
            dog.speak();

            Cat cat = new Cat("Cat Name", 3);
            cat.speak();
            System.out.println(cat);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Animal.getType());
    }
}
