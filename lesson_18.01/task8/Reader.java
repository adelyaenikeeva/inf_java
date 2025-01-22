package ninethexample.classwork.task8;

import java.util.Arrays;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//ФИО,
//номер читательского билета,
//факультет,
//дата рождения,
//телефон.
//Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса.
//Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В.
// взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и
// автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения,
// Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Reader {
    private String fio;
    private String number;
    private String libraryCardNumberl;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fio, String number, String libraryCardNumberl, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.number = number;
        this.libraryCardNumberl = libraryCardNumberl;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public String getNumber() {
        return number;
    }

    public String getLibraryCardNumberl() {
        return libraryCardNumberl;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.printf("%s взял %d книги\n", fio, numberOfBooks);
    }

    public void takeBook(String[] books) {
        System.out.printf("%s взял книги: %s\n", fio, String.join(", ", books));
    }

    public void takeBook(Book[] books) {
        System.out.println(fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(int numberOfBooks) {
        System.out.printf("%s вернул %d книги", fio, numberOfBooks);
    }

    public void returnBooks(Book[] books) {
        System.out.println(fio + " вернул книги:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
