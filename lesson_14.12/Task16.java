package SixthTasks;

//16.	Дано название футбольного клуба. Напечатать его на экране "столбиком".
public class Task16 {
    public static void main(String[] args) {
        String clubName = "Спартак";
        int size = clubName.length();

        for (int i = 0; i < size; i++) {
            System.out.println(clubName.charAt(i));
        }
    }
}
