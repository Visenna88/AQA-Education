package part4task2;


import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Student stud1 = new Student();

        Scanner in = new Scanner(System.in);
        //запрос имени
        System.out.print("Input a name of the student: ");
        String name = in.nextLine();
        stud1.name = name;

        System.out.println("Enter the subject: Math, Physics, PE, Literature");
        String selectSub = in.nextLine();

        System.out.println("Enter the score");
        int addedScore = in.nextInt();
        stud1.addScore(selectSub, addedScore);
        System.out.println("The score is added. The score is: " + stud1.showScore(selectSub, addedScore));


    }
}
