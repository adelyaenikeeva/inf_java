package eighthtask.oop.enumexample;

//  Кроме отдельных примитивных типов данных и классов в Java есть такой тип как enum или перечисление.
//  Перечисления представляют набор логически связанных констант.
//  Объявление перечисления происходит с помощью оператора enum, после которого идет название перечисления.
//  Затем идет список элементов перечисления через запятую:
enum Type{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}

public class Book {
    private Type bookType;
    String name;
    String author;

//    Само перечисление объявлено вне класса, оно содержит четыре жанра книг.
//    Класс Book кроме обычных переменных содержит также переменную типа нашего перечисления.
//    В конструкторе мы ее также можем присвоить, как и обычные поля класса.
    public Book(String name, String author, Type type){
        this.name = name;
        this.author = author;
        this.bookType = type;
    }

//    С помощью конструкции switch..case можно проверить принадлежность значения bookType определенной константе перечисления.
    public String getType(){
        switch(bookType){
            case BELLETRE:
                return "Belletre";
            case SCIENCE:
                return "Science";
            case SCIENCE_FICTION:
                return "Science fiction";
            case PHANTASY:
                return "Phantasy";
            default:
                return "Undefined";
        }
    }
}
