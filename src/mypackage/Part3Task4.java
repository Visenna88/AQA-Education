package mypackage;

import java.util.Arrays;

public class Part3Task4 {
    public static void main(String[] args) {
        int[] arr4 = {4, -5, 0, 6, 8};
        int[] arr4c = arr4.clone();

        int min = arr4[0];
        int max = arr4[0];
        int iMin = 0;
        int iMax = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (min > arr4[i]) {
                min = arr4[i];
                iMin = i;
            }
            if (max < arr4[i]) {
                max = arr4[i];
                iMax = i;
            }
        }
        arr4[iMin] = max;
        arr4[iMax] = min;
        System.out.println("Исходный массив до перестановки: " + Arrays.toString(arr4c));
        System.out.println();
        System.out.println("Массив после перестановки максимального и минимального элемента: " + Arrays.toString(arr4));
//        int max4 = arr4[arr4.length -1];
//        int min4 = arr4[0];
//        int idMin = 0;
//        int idMax = 0;
//
//        for (int i = 0; i <= arr4.length - 1; i++){
//            if (max4 <= arr4[i]){
//                max4 = arr4[i];
//                idMin = i;
//            }
//            if (min4 >= arr4[i]){
//                min4 = arr4[i];
//                idMax = i;
//            }
//        }
//        arr4[idMin] = max4;
//        arr4[idMax] = min4;





    }
}
