package eighthtask.oop.enumexample;

enum Operation{
    SUM{
        public int action(int x, int y){
            return x + y;
        }
    },
    SUBTRACT{
        public int action(int x, int y){
            return x - y;
        }
    },
    MULTIPLY{
        public int action(int x, int y){
            return x * y;
        }
    };
    public abstract int action(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s \n", book1.name, book1.getType());

//      Каждое перечисление имеет статический метод values(). Он возвращает массив всех констант перечисления:
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

//        Перечисление фактически представляет новый тип, поэтому мы можем определить переменную данного типа и использовать ее:
        Type type = Type.SCIENCE;
        System.out.println(type);

//        Также можно определять методы для отдельных констант:
        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}
