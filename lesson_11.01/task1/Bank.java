package eighthtask.task1;

//1.	Класс "Банк": Разработайте класс Банк, который будет иметь закрытое поле для баланса счета.
// Реализуйте методы для зачисления и снятия денег с баланса, где снятие не может превысить доступный баланс.

class Bank {
    private double balance;

    public Bank() {
        this.balance = 0.0;
    }

    public Bank(double balance) {
        this.balance = balance;
    }

//    или так
//    public Bank(double balance) {
//        setBalance(balance);
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("ошибка");
        }
    }

    public void withdraw(double value) {
        if (value <= 0) {
            System.out.println("Сумма для снятия должна быть положительной");
            return;
        }
        if (value <= balance) {
            this.balance -= value;
        } else {
            System.out.println("Недостаточно средств для снятия");
        }
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            System.out.println("Сумма для зачисления должна быть положительной");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}

