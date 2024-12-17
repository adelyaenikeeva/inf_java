package SixthTasks;

//10.	Дан текст, в котором имеются цифры.
//а) Найти их сумму.
//б) Найти максимальную цифру.
public class Task10 {
    public static void main(String[] args) {
        String str1 = "Hello java 123";

        int sum = 0;
        int maxDigit = -1;

//        переволим строку в массив символов
        char[] chArray = str1.toCharArray();

        for (char ch : chArray) {
//            проверяем, что символ - цифра
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch); // Преобразуем символ в цифру
                sum += digit;

                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
        }

        System.out.println(sum);
        System.out.println(maxDigit);
    }
}
