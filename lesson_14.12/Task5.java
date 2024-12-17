package SixthTasks;

//5.	Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.
public class Task5 {
    public static void main(String[] args) {
        String str1 = "Hello";
        boolean areEqual = str1.charAt(1) == str1.charAt(3);

        if (areEqual) {
            System.out.println("Второй и четвертый символы одинаковы.");
        } else {
            System.out.println("Второй и четвертый символы различаются.");
        }
    }
}
