package part4task2;

import java.util.ArrayList;
import java.util.Collections;

public class Subject {
    String subName;
    ArrayList<Integer> subGrade = new ArrayList<>();

    public Subject (String sname){
        subName = sname;
    }

    public int getMax () {
        int max = Collections.max(subGrade);
        return max;
    }

    public int getMin () {
        int min = Collections.min(subGrade);
        return min;
    }

    public double getAverage () {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < subGrade.size(); i++){
            sum += subGrade.get(i);
        }
        average = (double) sum /(double) subGrade.size();
        return average;
    }
}
