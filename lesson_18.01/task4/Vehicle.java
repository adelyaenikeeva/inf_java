package ninethexample.classwork.task4;

//Задание 4:
//Создайте интерфейс Vehicle, который будет содержать методы:
//•	void start()
//•	void stop()
//•	void speedUp(int increment)
//Реализуйте этот интерфейс в двух классах: Car и Bike. Поэкспериментируйте с различными значениями скорости
// и реализуйте логику, связанную с остановкой и запуском транспортных средств.
public interface Vehicle {
    void start();
    void stop();
    void speedUp(int increment);
}
