package SixthTasks;

//Дан текст. Найти наибольшее количество идущих подряд одинаковых символов.
public class Task31 {

    public static void main(String[] args) {
        String str = "aaabbbccddddddeff";
        int maxCount = 0;
        int currentCount = 1;

        // Проходим по строке
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++;
            } else {

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 1;
            }
        }


        if (currentCount > maxCount) {
            maxCount = currentCount;
        }

        System.out.println("Наибольшее количество идущих подряд одинаковых символов: " + maxCount);
    }
}
