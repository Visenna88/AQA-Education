package part4task2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
        // Сисок с именами
        List<String> nameList = new ArrayList<>(Arrays.asList("Pete", "Mike", "Jane"));


        // Список с отценками по математике
        List<String> subjectList = new ArrayList<>(Arrays.asList("Math", "Physics", "PE", "Literature"));
        List<Integer> mathPete = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 3, 4, 2));
        List<Integer> mathMike = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 4, 5));
        List<Integer> mathJane = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 4, 2, 2));

        //списки с оценками по физике
        List<Integer> physicsPete = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 3, 4, 2));
        List<Integer> physicsMike = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 4, 5));
        List<Integer> physicsJane = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 4, 2, 2));

        //сиски с оценками по физре
        List<Integer> pePete = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 3, 4, 2));
        List<Integer> peMike = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 4, 5));
        List<Integer> peJane = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 4, 2, 2));

        //списки с оценками по литературе
        List<Integer> literaturePete = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 3, 4, 2));
        List<Integer> literatureMike = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 4, 5));
        List<Integer> literatureJane = new ArrayList<Integer>(Arrays.asList(2, 3, 2, 4, 2, 2));

        Scanner in = new Scanner(System.in);

        //запрос имени
        System.out.print("Input a name of the student: ");
        String name = in.nextLine();

        if(nameList.contains(name)){
            if (name == "Pete") {
                System.out.println("Enter the subject: Math, Physics, PE, Literature");
                String subject = in.nextLine();
                switch (subject) {
                    case "Math":
                    System.out.print("Choose from the following options: " +
                                "1 - add the marks, " +
                                "2 - show the max mark, " +
                                "3 - show the min mark " +
                                "4 - show the average mark" +
                                "5 - show the average minimum mark for all subjects" +
                                "6 - show the average maximum mark for all subjects");
                    int selectionM = in.nextInt();
                        switch (selectionM) {
                            case 1:
                                System.out.println("Add the mark: ");
                                int mathPeteAdd = in.nextInt();
                                mathPete.add(mathPeteAdd);
                                System.out.println("The mark on Math for pete is added. The list of the marks is: " + mathPete);
                        }
                    case "Physics":
                        System.out.print("Choose from the following options: " +
                                "1 - add the marks, " +
                                "2 - show the max mark, " +
                                "3 - show the min mark " +
                                "4 - show the average mark" +
                                "5 - show the average minimum mark for all subjects" +
                                "6 - show the average maximum mark for all subjects");
                        int selectionP = in.nextInt();
                    case "PE":
                        System.out.print("Choose from the following options: " +
                                "1 - add the marks, " +
                                "2 - show the max mark, " +
                                "3 - show the min mark " +
                                "4 - show the average mark" +
                                "5 - show the average minimum mark for all subjects" +
                                "6 - show the average maximum mark for all subjects");
                        int selectionPE = in.nextInt();
                    case "Literature":
                        System.out.print("Choose from the following options: " +
                                "1 - add the marks, " +
                                "2 - show the max mark, " +
                                "3 - show the min mark " +
                                "4 - show the average mark" +
                                "5 - show the average minimum mark for all subjects" +
                                "6 - show the average maximum mark for all subjects");
                        int selectionL = in.nextInt();
                }


            }


        } else {
            System.out.println("There's no such a student");
        };
        in.close();
    }
}
