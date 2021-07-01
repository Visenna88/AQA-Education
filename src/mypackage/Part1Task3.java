package mypackage;

public class Part1Task3 {
    public static void main(String[] args) {
        System.out.println("Задание 3");

        int a3 = 15;
        int b3 = 19;
        int c3 = 13;
        int d3 = 9;
        int e3 = 20;


        if (a3 < b3 && a3 < c3 && a3 < d3 && a3 < e3) {
            System.out.println("Min value - " + a3);
        } else if (b3 < a3 && b3 < c3 && b3 < d3 && b3 < e3) {
            System.out.println("Min value - " + b3);
        } else if (c3 < a3 && c3 < b3 && c3 < d3 && c3 < e3) {
            System.out.println("Min value - " + c3);
        } else if (d3 < a3 && d3 < b3 && d3 < c3 && d3 < e3) {
            System.out.println("Min value - " + d3);
        } else if (e3 < a3 && e3 < b3 && e3 < c3 && e3 < d3) {
            System.out.println("Min value - " + e3);
        };

        if (a3 > b3 && a3 > c3 && a3 > d3 && a3 > e3) {
            System.out.println("Max value - " + a3);
        } else if (b3 > a3 && b3 > c3 && b3 > d3 && b3 > e3) {
            System.out.println("Max value - " + b3);
        } else if (c3 > a3 && c3 > b3 && c3 > d3 && c3 > e3) {
            System.out.println("Max value - " + c3);
        } else if (d3 > a3 && d3 > b3 && d3 > c3 && d3 > e3) {
            System.out.println("Max value - " + d3);
        } else if (e3 > a3 && e3 > b3 && e3 > c3 && e3 > d3) {
            System.out.println("Max value - " + e3);
        };
    }
}
