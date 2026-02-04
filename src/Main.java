import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int [] inputArray1 = {12000, 15000, 11000, 17000, 21000};
        int max = inputArray1[0];
        int sum = 0;
        int min = inputArray1[0];

        for (int value : inputArray1) {
            sum += value;
            if (value > max){
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        double average = (double) sum / inputArray1.length;
        double [] outputArray1 = {sum, max, min, average};
        System.out.println("inputArray1 " + Arrays.toString(inputArray1));
        System.out.println("inputArray1 " + Arrays.toString(outputArray1));
        System.out.println();

        // Задание 2

        System.out.println("Задание 2");

        int [] inputArray2 = {17000, 18000, 5500, 69000, 22000};
        double [] outputArray2 = new double [inputArray2.length];
        double tax = 0.13;

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * tax;
        }
        System.out.println("inputArray2 " + Arrays.toString(inputArray2));
        System.out.println("outputArray2 " + Arrays.toString(outputArray2));
        System.out.println();

        // Задание 3

        System.out.println("Задание 3");

        int [] inputArray3 = {3000, 6500, 7400, 4800, 3600};
        boolean [] outputArray3 = new boolean[inputArray3.length];
        int bonus = 5000;

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > bonus;
        }
        System.out.println("inputArray3 " + Arrays.toString(inputArray3));
        System.out.println("outputArray3 " + Arrays.toString(outputArray3));
        System.out.println();

        // Задание 4

        System.out.println("Задание 4");

        int [] inputArray4 = {615, 422, 584, -15, 142};
        boolean [] outputArray4 = {true};

        for (int value : inputArray4) {
            if (value < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("inputArray4 " + Arrays.toString(inputArray4));
        System.out.println("outputArray4 " + Arrays.toString(outputArray4));
        System.out.println();

        // Задание 5

        System.out.println("Задание 5");

        int [] inputArray5 = {20000, 15000, 14000, 11000, 0};
        int [] outputArray5 = {0};

        for (int value : inputArray5) {
            if (value > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println("inputArray5" + Arrays.toString(inputArray5));
        System.out.println("outputArray5 " + Arrays.toString(outputArray5));
    }
}