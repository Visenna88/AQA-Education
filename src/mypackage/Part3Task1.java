package mypackage;

import java.util.Arrays;

public class Part3Task1 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 2 * i + 1;
        }
        System.out.println("Вариант 1: ");
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println("Вариант 2: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 2 * i + 1;
            if (arr1[i] == 1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(", " + arr1[i]);
            }
        }











    }
}
