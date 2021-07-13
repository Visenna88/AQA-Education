package mypackage;


import java.util.Arrays;

public class Part3Task3 {
    public static void main(String[] args) {
        int[] arr2 = {7,-2,5,-1};
        int max = arr2[arr2.length -1];
        Arrays.sort(arr2);
        System.out.println("Задание 3, вариант 1");
        System.out.println("Наибольший элемент массива: " + arr2[arr2.length -1]);

        System.out.println("\nЗадание 3, вариант 2 (for)");
        for (int i = 0; i <= arr2.length - 1; i++){
            if (max <= arr2[i]){
                max = arr2[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
    }
}
