package info.classwork;

//11.	Напишите программу, которая принимает массив строк и пытается преобразовать каждую строку в число.
// Если преобразование невозможно, программа должна обрабатывать NumberFormatException.
public class Task11 {
    public static void main(String[] args) {
        String[] input_array = {
                "123",
                "234",
                "Hello",
                "89"
        };

        for (String arr : input_array) {
            try {
                System.out.println(Integer.parseInt(arr));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число: " + arr);
            }
        }
    }
}
