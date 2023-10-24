import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = new int[3] ;
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        float[] number = new float[3];
        number[0] = 1.57f;
        number[1] = 7.654f;
        number[2] = 9.986f;
        System.out.println(Arrays.toString(number));
        double[] pin = new double[] {1, 9, 1.234, 2.345};
        pin[0] = 1;
        pin[1] = 9;
        pin[2] = 1.234;
        pin[3] = 2.345;
        System.out.println(Arrays.toString(pin));

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = {1, 2, 3};
        System.out.println(Arrays.toString(weight));
        float[] number = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(number));
        double[] pin = {1, 9, 1.234, 2.345};
        System.out.println(Arrays.toString(pin));

    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = new int[3];
        weight[0] = 3;
        weight[1] = 2;
        weight[2] = 1;
        System.out.println(Arrays.toString(weight));
        float[] number = new float[] {9.986f, 7.654f, 1.57f};
        System.out.println(Arrays.toString(number));
        double[] pin = new double[] {2.345, 1.234, 9, 1};
        System.out.println(Arrays.toString(pin));
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3,};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}