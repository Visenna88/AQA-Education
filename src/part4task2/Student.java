package part4task2;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    String name;

    public void maxScore (){
        ArrayList<Integer> subjectScore = new ArrayList<Integer>();
        int max = Collections.max(subjectScore);
        System.out.println("Maximum score is: " + max);
    }

    public void minScore (){
        ArrayList<Integer> subjectScore = new ArrayList<Integer>();
        int min = Collections.min(subjectScore);
        System.out.println("Minimum score is: " + min);
    }

  




}
