package SixthTasks;

//12.	Из слова яблоко путем "вырезок" и "склеек" его букв получить слова блок и око.
public class Task12 {
    public static void main(String[] args) {
        String str1 = "яблоко";

        // "блок"
        String block = str1.substring(1, 5);
        // "око"
        String oco = str1.substring(3, 6);

        System.out.println("Слово 'блок': " + block);
        System.out.println("Слово 'око': " + oco);
    }
}
