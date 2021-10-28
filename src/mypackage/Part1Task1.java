package mypackage;

public class Part1Task1 {
    public static void main(String[] args) {

        //Task 1
        int a = 10;
        int b = 7;
        int c = 2;
        int d = 8;
        System.out.println();
        System.out.println("ЛОГИЧЕСКИЕ И УСЛОВНЫЕ ОПЕРАТОРЫ" +
                "(IF, IF-ELSE И SWITCH)");
        System.out.println("Задание 1, вариант 1");

        if (a < b && a < c && a < d) {
            System.out.println("Min value - " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Min value - " + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Min value - " + c);
        } else if (d < a && d < b && d < c) {
            System.out.println("Min value - " + d);
        }
        ;

        //Первый пришедший в голову вариант
        System.out.println();
        System.out.println("Задание 1, вариант 2");
        int solution = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("Min value - " + solution);
    }
}
