package part4task2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name of the student: ");
        String name = in.nextLine();

//


        List<String> nameList = new ArrayList<>(Arrays.asList("Pete", "Mike", "Jane", "Ann"));

        List<String> subjectList = new ArrayList<String>(Arrays.asList("Math", "Physics", "PE", "Literature"));


        if(nameList.contains(name)){
            System.out.println("Select the subject: Math, Physics, PE, Literature");
            String subject = in.nextLine();
            if (subject == "Math") {

            }


            System.out.print("Choose from the following options: " +
                        "1 - add the marks, " +
                        "2 - show the max mark, " +
                        "3 - show the min mark " +
                        "4 - show the average mark" +
                        "5 - show the average minimum mark for all subjects" +
                        "6 - show the average maximum mark for all subjects");
            int selection = in.nextInt();

        } else {
            System.out.println("There's no such a student");
        };
        in.close();
    }
}
