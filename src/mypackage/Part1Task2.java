package mypackage;

public class Part1Task2 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        int a2 = 5;
        int b2 = 9;
        int c2 = 3;
        int d2 = 9;

        int maxvalue = Math.max(Math.max(a2, b2), Math.max(c2, d2));
        int in;
        in = 0;

        if (a2 == maxvalue) {
            in++;
        } if (b2 == maxvalue) {
            in++;
        } if (c2 == maxvalue) {
            in++;
        } if (d2 == maxvalue) {
            in++;
        };

        System.out.println("Количество максимальных элементов: " + in);
    }
}
