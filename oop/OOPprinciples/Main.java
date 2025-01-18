package eighthtask.oop.OOPprinciples;

public class Main {
    public static void main(String[] args) {
        try {
            Person2 person4 = new Person2("Name", 20);
            Person2 person5 = new Person2(20);
            Person2 person6 = new Person2("Name");

//        person4.age = -20;
//      не получится установить отрицательное значение
            person4.setAge(20);
            System.out.println(person4.getAge());
            System.out.println(person4);

            System.out.println(person5);
            System.out.println(person6);


            System.out.println("\nПРИМЕР НАСЛЕДОВАНИЯ");
            Employee employee = new Employee("Employee Name", 20);
            employee.setAge(50);
            employee.speak("Employee hobby");

            System.out.println("\n" + employee + "\n");

            Employee employee2 = new Employee("Employee2 Name", 30, "Microsoft");
            employee2.work();
            System.out.println();
            employee2.speak();
            System.out.println(employee2);

            System.out.println(employee2.displayInfo());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();

//      Восходящее преобразование (upcasting) происходит, когда объект подкласса обрабатывается как объект суперкласса.
//      Это позволяет использовать полиморфизм, т.к. мы можем хранить различные подклассы в одной коллекции, основанной на суперклассе.

//      Создаем объект Employee, но рассматриваем как Person2
//      Полиморфизм позволяет использовать объекты подкласса (в данном случае, Employee)
//      через ссылку на базовый класс (или интерфейс, например Person2).
        Person2 myEmployee = new Employee("Имя", 30); // Восходящее преобразование

//        Позднее связывание (или динамическое связывание) происходит, когда метод, вызываемый на объекте,
//        определяется не во время компиляции, а во время выполнения программы.

//        В Java такая функция достигается автоматически для переопределенных методов:
//        вызов метода displayInfo класса Employee, а не Person2
        System.out.println(myEmployee.displayInfo());
        myEmployee.speak("Hobby");

//        Пример Полиморфизма
//      Рассмотрим следующую ситуацию:
//      У вас есть базовый класс Person2.
//      У вас есть два подкласса: Employee и Manager, которые наследуются от Person2.
//      Переменная Базового Класса
//      Теперь, если у вас есть переменная типа Person2, она может ссылаться на любой объект, который является наследником Person2, например:
        Person2 myEmployee2; // переменная типа Person2

        myEmployee2 = new Employee("Иван", 25); // ссылаться на объект Employee
        System.out.println(myEmployee2.displayInfo()); // Вызов метода displayInfo() для Employee

        myEmployee2 = new Manager("Анна", 30); // теперь ссылаться на объект Manager
        System.out.println(myEmployee2.displayInfo()); // Вызов метода displayInfo() для Manager

//        Объяснение
//      Тип переменной: Когда вы объявляете переменную myEmployee2 как Person2, это означает,
//      что она может хранить ссылку на любой объект, который является экземпляром Person2 или его подклассов (Employee, Manager и т.д.).
//      Присваивание объектов: Когда вы присваиваете объект Employee переменной myEmployee2, фактически вы говорите,
//      что переменная myEmployee2 сейчас ссылается на объект типа Employee. То же самое происходит и с объектом Manager.
//      Вызов методов: Когда вы вызываете метод displayInfo(), фактический метод, который будет вызван, зависит
//      от типа объекта, на который указывает переменная myEmployee2, а не от типа переменной. Это называется динамическим связыванием.
//      Таким образом, если myEmployee ссылается на объект Employee2, будет вызван метод displayInfo() класса Employee.
//      Если myEmployee ссылается на объект Manager, то будет вызван метод displayInfo() класса Manager.


        // Массив объектов типа Person2
        Person2[] people = new Person2[3];

        // Заполнение массива объектами разных подклассов
        people[0] = new Employee("Алексей", 28);
        people[1] = new Manager("Ирина", 35);
        people[2] = new Employee("Светлана", 30);

//      Полиморфизм: Мы имеем массив people, который содержит ссылки на объекты Employee и Manager,
//      но мы обращаемся к ним через общий тип Person2.
//      Обработка: В цикле мы можем легко вызывать метод displayInfo() на каждом объекте в массиве,
//      даже если у них разные реализации этого метода.
//      Это демонстрирует одно из ключевых свойств полиморфизма: возможность обработки объектов разных типов через общий интерфейс.

        // Обработка массива объектов
        for (Person2 pers : people) {
            System.out.println(pers.displayInfo());
        }
    }
}
