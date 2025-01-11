package eighthtask.task1;

public class Task1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getBalance());
        bank.setBalance(1000);
        System.out.println(bank);

        Bank bank2 = new Bank(1_000_000);
        System.out.println(bank2);

        bank2.deposit(2000);
        System.out.println(bank2);

        bank2.withdraw(1000);
        System.out.println(bank2);

        bank2.setBalance(-2000);
        System.out.println(bank2);

    }
}
