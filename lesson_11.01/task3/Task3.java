package eighthtask.task3;

public class Task3 {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Rav4", 70);
        System.out.println(auto);
        auto.setSpeed(65);
        auto.setSpeed(250);

        System.out.println(auto);
    }
}
