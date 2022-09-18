import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1a(); //Задание 1 - 1 вариант решения
        task1b(); //Задание 1 - 2 вариант решения
        task2();
        task3();
        task4();
    }
    private static void task4() {
        System.out.println("Задание 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int[] spending = new int[30];
        for (int index = 0; index < spending.length; index++) {
            spending[index] = index * 3144 + 100000;
        } //рандомные числа
        int sum = Arrays.stream(spending).sum();
        double averageSpending = (double) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.");// числа разные поэтому результат решения отличается
        System.out.println();
    }
        private static void task2 () {
            System.out.println();
            System.out.println("Задание 2");
            int[] spending = new int[30];
            for (int index = 0; index < spending.length; index ++) {
                spending[index] = index * 3144 + 100000;}//рандомные числа идентичные 1 варианту 1 задания
            Arrays.sort(spending);
                int min = spending[0];
                int max = spending[29];
                    System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
                    System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
            }
        private static void task1b () {
            System.out.println("Задание 1 (2 вариант)");
            int[] spending = new int[]{103_000, 105_000, 108_500, 110_300, 112_400, 116_000, 118_700, 121_350, 124_365, 126_500,
                    128_700, 131_400, 136_568, 139_700, 142_000, 144_000, 147_800, 152_300, 154_200, 158_800, 164_100, 168_756, 172_300,
                    175_468, 180_000, 184_000, 187_500, 190_000, 192_000, 195_280};
            int sum = 0;
            for (int element : spending) {
                sum += element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей."); // числа разные поэтому результат решения отличается
        }
        private static void task1a () {
            System.out.println();
            System.out.println("Задание 1 (1 вариант)");
            int[] spending = new int[30];
            for (int index = 0; index < spending.length; index++) {
                spending[index] = index * 3144 + 100000; //рандомные числа
                System.out.print(spending[index] + " ");
            }
            int sum = Arrays.stream(spending).sum();
            System.out.println();
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");// числа разные поэтому результат решения отличается
            System.out.println();
        }
    }
