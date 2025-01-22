package ninethexample.classwork.task4;

public class Car implements Vehicle {

    // текущая скорость автомобиля
    private int speed;
    // статус работы (работает или остановлен)
    private boolean isRunning;


    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Машина завелась");
        } else {
            System.out.println("Машина уже заведена");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            speed = 0;
            isRunning = false;
            System.out.println("Машина остановилась");
        } else {
            System.out.println("Машина уже остановлена");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (isRunning) {
            speed += increment;
            System.out.println("Текущая скорость: " + speed + " км/ч");
        } else {
            System.out.println("Машина не заведена");
        }
    }
}
