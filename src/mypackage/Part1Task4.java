package mypackage;

public class Part1Task4 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        String name1 = " Vasia";
        String name2 = "vasia";
        name1 = name1.trim().toLowerCase();
        name2 = name2.trim().toLowerCase();
        if (name1.equals(name2)) {
            System.out.println("Эти люди - тезки");
        } else {
            System.out.println("Эти люди - не тезки");
        };
    }
}
