import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int expenseMax = 1;
        int expenseMin = 200000;
        for (final int current : arr) {
            if (current > expenseMax) {
                expenseMax = current;
            }
            if (current < expenseMin) {
                expenseMin  = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + expenseMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + expenseMax + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        double sumAverage = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = (sum + arr[index]);
            sumAverage = sum / 30;

        }
        System.out.println(sumAverage);

    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i;
        for ( i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}