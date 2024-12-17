package SixthTasks;

//Дано предложение, в котором имеется несколько букв е. Найти:
//а) порядковый номер первой из них;
//б) порядковый номер последней из них.
public class Task26 {
    public static void main(String[] args) {
        String text = "Это пример предложения";
        char targetChar = 'е';

        int firstIndex = text.indexOf(targetChar);
        int lastIndex = text.lastIndexOf(targetChar);

        if (firstIndex != -1) {
            System.out.println("Порядковый номер первой буквы '" + targetChar + "': " + (firstIndex + 1));
        } else {
            System.out.println("Буква '" + targetChar + "' не найдена");
        }

        if (lastIndex != -1) {
            System.out.println("Порядковый номер последней буквы '" + targetChar + "': " + (lastIndex + 1));
        } else {
            System.out.println("Буква '" + targetChar + "' не найдена");
        }
    }
}
