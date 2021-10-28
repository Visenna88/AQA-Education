package mypackage;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Part3Task5 {
    public static void main(String[] args) {
    int [] arr5 = new int[9];

        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int)(Math.random()*10);

        }
        System.out.println("Изначальный массив, заполненный случайными числами: " + Arrays.toString(arr5));
        double sum = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum += arr5[i];
        }
        double average = sum / arr5.length;
        String aver = new DecimalFormat("#0.00").format(average);
        System.out.println();
        System.out.println("Среднее арифметическое всех элементов массива, заполненнного случайными числами: " + aver);
    }
}
