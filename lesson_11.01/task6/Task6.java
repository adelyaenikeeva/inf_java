package eighthtask.task6;

public class Task6 {
    public static void main(String[] args) {
        Phone phone = new Phone("+7911111111", "Iphone", 12);
        System.out.println(phone);

        phone.setNumber("+7922");
        System.out.println(phone);

        phone.receiveCall("name");
        phone.receiveCall("name", "kazan");
    }
}
