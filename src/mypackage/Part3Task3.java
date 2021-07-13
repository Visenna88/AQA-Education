package mypackage;


import java.util.Arrays;

public class Part3Task3 {
    public static void main(String[] args) {
        int[] arr2 = {7,-2,5,-1};
        int min = arr2[0];
        Arrays.sort(arr2);
        System.out.println("Задание 3, вариант 1");
        System.out.println("Наименьший элемент массива: " + arr2[0]);
        System.out.println("\nЗадание 3, вариант 2 (for)");
        for (int i = 0; i <= arr2.length - 1; i++){
            if (min >= arr2[i]){
                min = arr2[i];
            }
        }
        System.out.println("Наименьший элемент массива: " + min);
    }
}
