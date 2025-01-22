package ninethexample.classwork.task1;

//Создайте абстрактный класс Profession с методом work()
//Реализуйте два дочерних класса:
//Doctor (метод work возвращает, например: "Лечу пациентов.").
//Teacher (метод work возвращает: "Преподаю уроки.").
//Реализуйте функцию, которая принимает список профессий и вызывает метод work() для каждого из объектов.
public abstract class Profession {
    public abstract void work();
}
