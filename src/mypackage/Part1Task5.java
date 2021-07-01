package mypackage;

public class Part1Task5 {
    public static void main(String[] args) {
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
        };
    }
}
