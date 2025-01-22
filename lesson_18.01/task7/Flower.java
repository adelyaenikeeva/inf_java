package ninethexample.classwork.task7;

//7.	Цветы
//Создать класс Flower, который содержит переменные название, страна производитель, срок хранения в днях, цена.
//Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
//Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
//Также подсчитать количество проданных цветов (используем статическую переменную).
public class Flower {
    private String name;
    private String country;
    private int exp_date;
    private double price;

    private static int count = 0;

    public Flower(String name, String country, int exp_date, double price) {
        count++;
        this.name = name;
        this.country = country;
        this.exp_date = exp_date;
        setPrice(price);
    }

    public static int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("error");
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", exp_date=" + exp_date +
                ", price=" + price +
                '}';
    }
}
