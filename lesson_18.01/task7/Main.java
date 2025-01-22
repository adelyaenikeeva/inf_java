package ninethexample.classwork.task7;

import eighthtask.task7.Flowers.Flower;
import eighthtask.task7.Flowers.Roses;
import eighthtask.task7.Flowers.Tulips;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        flowers[0] = new Roses("Roses", "Russia", 15, 100.3);
        flowers[1] = new Tulips("Tulips", "Russia", 10, 80.3);
        flowers[2] = new Roses("Roses 2.0", "Russia", 5, 120.5);

        double price = 0;

        for (Flower flower : flowers) {
            System.out.println(flower);
            price += flower.getPrice();
        }

        System.out.printf("Кол-во проданных цветов %d\n", Flower.getCount());
        System.out.printf("Общая стоимость %s", price);
    }
}
