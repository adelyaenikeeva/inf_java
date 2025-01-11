package eighthtask.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6.	Класс Phone.
//	Создайте класс Phone, который содержит переменные number, model и weight.
//	Создайте три экземпляра этого класса.
//	Выведите на консоль значения их переменных.
//	Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//	Выводит на консоль сообщение “Звонит {name}” + номер.
//	Метод getNumber – возвращает номер телефона
//setNumber -	(c помощью регулярного выражения проверить что номер является корректным).
//	Вызвать эти методы для каждого из объектов.
//	Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//	Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//	Добавить конструктор без параметров.
//	Вызвать из конструктора с тремя параметрами конструктор с двумя.
//	Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и локацию (+ номер телефона звонящего). Вызвать этот метод.

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        setNumber(number);
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (!isValidNumber(number)) {
            System.out.println("error");
            return;
        }
        this.number = number;
    }

    private boolean isValidNumber(String number) {
        // Здесь определяется регулярное выражение для проверки корректности номера
//        Регулярное выражение: ^\\+\\d{10}$
//  ^ - Начало строки.
//  \\+ - Символ +, который должен быть в начале.
//  \\d{10} - Десять цифр.
//  $ - Конец строки.
        String regex = "^\\+\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ", Number " + getNumber());
    }

    public void receiveCall(String name, String location) {
        System.out.println("Звонит " + name + ", Location " + location + ", Number " + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
