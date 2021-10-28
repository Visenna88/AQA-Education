package mypackage;

public class Part2Task3 {
    public static void main(String[] args) {
        System.out.println("Задание 3.1, while");
        int wk = 0;
        while ( wk >=0 && wk <=99) {
            wk++;
            if (wk % 2 != 0) {
                System.out.print(wk + " ");
            }
        }
        System.out.println("\n\nЗадание 3.2, while");
        int n2 = 4; //значене факториала
        int factorial = 1; //первое значение в последовательности чисел до wn
        int count = 1;

        while (count <= n2){
            factorial *= count;
            count++;
        }
        System.out.println(factorial);
        System.out.println();
    }
}
