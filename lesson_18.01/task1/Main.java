package ninethexample.classwork.task1;

//Реализуйте функцию, которая принимает массив профессий и вызывает метод work() для каждого из объектов.
public class Main {
    public static void getProfessions(Profession[] professions) {
        for (Profession profession : professions) {
            profession.work();
        }
    }

    public static void main(String[] args) {
        Profession[] professions = new Profession[2];
        professions[0] = new Doctor();
        professions[1] = new Teacher();

        Main.getProfessions(professions);
    }
}
