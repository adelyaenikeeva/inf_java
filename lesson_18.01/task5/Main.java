package ninethexample.classwork.task5;
//В методе Main создайте массив из объектов дочерних классов с восходящим преобразованием до родительского класса.
// Затем покажите работу полиморфизма на примере переопределенных методов.
public class Main {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog(20, "name", "Корги");
            Cat cat = new Cat(14, "cat name", "черный");
            dog.speak();
            dog.setAge(-20);

            Animal[] animal = new Animal[3];
            animal[0] = new Dog(30, "dog name", "breed");
            animal[1] = new Cat(23, "cat2 name2", "color");
            animal[2] = new Dog(12, "name dog", "breed2");

            for (Animal animal1 : animal) {
                animal1.speak();
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
