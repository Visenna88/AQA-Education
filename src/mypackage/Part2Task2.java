package mypackage;

public class Part2Task2 {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание 2");

        int n = 4; // значене факториала
        int f = 1; // первое значение в последовательности чисел до n

        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        System.out.println("Факториал 4 - " + f);
    }
}
