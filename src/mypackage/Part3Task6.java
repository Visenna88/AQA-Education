package mypackage;

import java.util.Arrays;

public class Part3Task6 {
    public static void main(String[] args) {
        int [] arr6 = new int[20];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = (int) ((Math.random() * 1000) + 1);
        }
        System.out.println("Массив, заполненный случайными числами: " + Arrays.toString(arr6));

        boolean sorted = false;
        int temp;
        while(!sorted) { sorted = true;
            for (int i = 0; i < arr6.length - 1; i++) {
                    if (arr6[i] > arr6[i+1]) {
                        temp = arr6[i];
                        arr6[i] = arr6[i+1];
                        arr6[i+1] = temp;
                        sorted = false;
                    }
                }
            }
        System.out.println("Массив, отсоритрованный пузырьком: " + Arrays.toString(arr6));
        }

    }

