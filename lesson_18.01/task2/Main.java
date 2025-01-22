package ninethexample.classwork.task2;

public class Main {

    public static String getSeasons(Season season){
        switch(season){
            case WINTER:
                return "Холодно";
            case SUMMER:
                return "Жарко";
            case SPRING:

            case AUTUMN:
                return "Прохладно";
            default:
                return "Неизвестный сезон";
        }
    }

    public static void main(String[] args) {
        Season season = Season.WINTER;

        System.out.println(Main.getSeasons(season));
    }
}
