package eighthtask.task4;

//4.	Класс "Курс обмена валют": Напишите класс КурсОбмена, который будет иметь закрытые поля для текущего обменного курса валюты.
// Реализуйте методы для получения и установки курса, где проверка обеспечивает разумные пределы курса (например, 0.01 до 500).
public class CurrencyExchange {
    private double currency = 100.54;

    private static double min = 0.01;
    private static double max = 500.0;

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        if (currency < min || currency > max) {
            System.out.println("error");
            return;
        }
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format("CurrencyExchange{currency=%.2f}", currency);
    }
}
