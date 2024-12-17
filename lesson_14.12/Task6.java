package SixthTasks;

//6.	Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
public class Task6 {
    public static void main(String[] args) {
        String str1 = "Hello".toLowerCase();
        char firstChar = str1.charAt(0);
        char lastChar = str1.charAt(str1.length() - 1);

        System.out.println(firstChar == lastChar);
    }
}
