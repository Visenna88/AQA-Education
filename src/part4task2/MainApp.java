package part4task2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Subject> subjectList = new ArrayList<>();

        Student stud1 = new Student();
        stud1.name = "Pete";
        Student stud2 = new Student();
        stud2.name = "Ann";
        Student stud3 = new Student();
        stud3.name = "Jane";

        studentsList.add(stud1);
        studentsList.add(stud2);
        studentsList.add(stud3);

        Subject subj1 = new Subject();
        subj1.subName = "Math";
        subj1.subGrade = ;

        Subject subj2 = new Subject();
        subj2.subName = "PE";


        Subject subj3 = new Subject();
        subj3.subName = "Physics";


        Subject subj4 = new Subject();
        subj4.subName = "Literature";


        Scanner in = new Scanner(System.in);
        String stname = in.nextLine();
        System.out.println("Please enter the name: ");
        if (studentsList.contains(stname)) {

        } else  {
            System.out.println("There's no such student");
        }



        in.close();
    }
}
