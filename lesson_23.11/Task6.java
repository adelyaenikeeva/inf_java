package third_tasks;

// 6.	Заполнить массив:
//а) десятью первыми членами арифметической прогрессии с известным первым членом прогрессии a и ее разностью p;
//б) двадцатью первыми членами последовательности Фибоначи
// (последовательности, в которой первые два члена равны 1, а каждый следующий равен сумме двух предыдущих)

public class Task6 {
    public static void main(String[] args) {
//        а)
        int a = 5; // первый член прогрессии
        int p = 3; // разность прогрессии
        int[] progression = new int[10];

        for (int i = 0; i < progression.length; i++) {
            progression[i] = a + i * p;
        }

        System.out.println("Арифметическая прогрессия:");
        for (int num : progression) {
            System.out.print(num + " ");
        }

//        б)
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Последовательность Фибоначчи:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
