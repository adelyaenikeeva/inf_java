package FifthTasks;

//Треугольный Ступенчатый Массив:
//Создайте и заполните ступенчатый массив в форме треугольника
// (т.е. количество элементов в каждой последующей строке увеличивается
// на один по сравнению с предыдущей строкой). Заполните массив квадратами индексов (a[i][j] = i * j).

public class Task11 {
    public static void getMatrix(int n) {
        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i * j;
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getMatrix(5);
    }
}
