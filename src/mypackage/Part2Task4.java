package mypackage;

public class Part2Task4 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        System.out.println();
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
    }
}
