package SixthTasks;

//Дано слово из четного числа букв. Поменять местами его половины следующим способом:
// первую букву поменять с последней, вторую — с предпоследней и т. д.
public class Task29 {

    public static void main(String[] args) {
        String str = "HelloJav";

        int mid = str.length() / 2;
        String firstHalf = str.substring(0, mid);
        String secondHalf = str.substring(mid);

        char[] reversed = new char[str.length()];

        // Меняем местами символы из двух половин
        for (int i = 0; i < mid; i++) {
            reversed[i] = secondHalf.charAt(mid - 1 - i); // Вторая половина
            reversed[mid + i] = firstHalf.charAt(mid - 1 - i); // Первая половина
        }
        System.out.println(new String(reversed));
    }
}
