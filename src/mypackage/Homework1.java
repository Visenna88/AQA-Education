package mypackage;

import java.sql.SQLOutput;

public class Homework1 {
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
        };

        //Первый пришедший в голову вариант
        System.out.println();
        System.out.println("Задание 1, вариант 2");
        int solution = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("Min value - " + solution);

        System.out.println();
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

        System.out.println(in);

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
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
        System.out.println();
        System.out.println("Задание 4");
        String name1 = "Vasia";
        String name2 = "Vasia";
        if (name1.equals(name2)) {
            System.out.println(name1 + " и " + name2 + " - тезки");
        } else {
            System.out.println(name1 + " и " + name2 + " - не тезки");
        }
        System.out.println();
        System.out.println("Задание 5");

        int dateMonth = 4;
        if (dateMonth == 12 || dateMonth == 1 || dateMonth == 2) {
            System.out.println("Сейчас зима");
        } else if (dateMonth == 3 || dateMonth == 4 || dateMonth == 5) {
            System.out.println("Сейчас весна");
        } else if (dateMonth == 6 || dateMonth == 7 || dateMonth == 8) {
            System.out.println("Сейчас лето");
        } else if (dateMonth == 9 || dateMonth == 10 || dateMonth == 11) {
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Пожалуйста, используйте число от 1 до 12");
        }
        System.out.println();
        System.out.println("ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE), ОПЕРАТОР BREAK");
        System.out.println("Задание 1");

        for (int k = 1; k <= 99; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println("\n\nЗадание 2");

        int n = 4; // значене факториала
        int f = 1; // первое значение в последовательности чисел до n

        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        System.out.println("Факториал 4 - " + f);
        System.out.println();
        System.out.println("Задание 3.1, while");
        int wk = 1;
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
        System.out.println("Задание 4");

        int count2 = 1; //счетчик, сколько раз число умножится на само себя
        int x = 2; //целое натуральное число
        int n3 = 3; //степень
        int answer = 1; //условно нулевая степень любого числа

        while (count2 <= n3) {
            answer = answer*x;
            count2++;
        }
        System.out.println("Ответ: " + answer);
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Первые 10 чисел последовательности: ");
        int a5 = 0;
        int diff = -5;
        int n5 = 1;

        while (1 <= n5 && n5 <= 10){
            int answ = (a5 + (n5 - 1)*diff);
            n5++;
            System.out.print(answ + "; ");
        }















    }
}








