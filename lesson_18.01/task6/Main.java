package ninethexample.classwork.task6;

public class Main {
    public static void main(String[] args) {
//Создать массив типа Student, содержащий объекты класса Student и Aspirant.
// Вызвать метод getScholarship() для каждого элемента массива.

        Student[] students = new Student[3];
        students[0] = new Student(" ", " ", "111", 5);
        students[1] = new Aspirant(" ", " ", "222", 4, " ");
        students[2] = new Aspirant(" ", " ", "222", 5, " ");

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}
