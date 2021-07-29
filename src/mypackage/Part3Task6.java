package mypackage;

import java.util.Arrays;

public class Part3Task6 {
    public static void main(String[] args) {
        int [] arr6 = new int[20];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = (int) ((Math.random() * 1000) + 1);
        }
        System.out.println("Массив, заполненный случайными числами: " + Arrays.toString(arr6));
        

    }
}
