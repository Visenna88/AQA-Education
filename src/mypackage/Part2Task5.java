package mypackage;

public class Part2Task5 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        System.out.println("Первые 10 чисел последовательности: вариант с while");
        int a5 = 0;
        int diff = -5;
        int n5 = 1;

        while (1 <= n5 && n5 <= 10){
            int answ = (a5 + (n5 - 1)*diff);
            n5++;
            System.out.print(answ + "; ");
        }
        System.out.println();
        System.out.println("\nПервые 10 чисел последовательности: вариант с for");
        for (n5 = 1; 1 <= n5 && n5 <= 10; n5++){
            int answ = (a5 + (n5 - 1)*diff);
            System.out.print(answ + "; ");
        }

    }
}
