package ninethexample.classwork.task6;
//Создайте пример наследования, реализуйте класс Student и класс Aspirant,
// аспирант отличается от студента наличием некой научной работы.
//Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
// Если средняя оценка студента равна 5, то сумма 2000, иначе 1900. Переопределить этот метод в классе Aspirant.
// Если средняя оценка аспиранта равна 5, то сумма 2500, иначе 2200.
//Создать массив типа Student, содержащий объекты класса Student и Aspirant.
// Вызвать метод getScholarship() для каждого элемента массива.
public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark != 5) {
            return 1900;
        }
        return 2000;
    }
}
