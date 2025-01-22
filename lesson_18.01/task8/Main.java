package ninethexample.classwork.task8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой");
        Book book2 = new Book("1984", "Джордж Оруэлл");
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков");

        Book[] booksToTake = {book1, book2, book3};
        String[] books = {"Приключения", "Словарь", "Энциклопедия"};

        Reader reader = new Reader("Петров В.В.");

        reader.takeBook(booksToTake);
        reader.takeBook(3);
        reader.takeBook(books);
        reader.returnBooks(booksToTake);
    }
}
