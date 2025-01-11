package eighthtask.task4;

public class Task4 {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        System.out.println(currencyExchange);

        currencyExchange.setCurrency(400);
        currencyExchange.setCurrency(600);
        System.out.println(currencyExchange);
    }
}
