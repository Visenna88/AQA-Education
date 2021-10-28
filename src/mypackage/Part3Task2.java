package mypackage;


import java.util.Arrays;

public class Part3Task2 {
    public static void main(String[] args) {
                printMinElementsArray(new int[]{6,2,3,7,5});
            }

            private static void printMinElementsArray(int[] array) {
                Arrays.sort(array);
                if (array[0] == array[array.length - 1])
                    System.out.print(Arrays.toString(array));
                else {
                    for (int value : array) {
                        if (value == array[0])
                            System.out.print(value + " ");
                    }
                }
            }
        }


