package part4task2;


import java.util.LinkedHashMap;
import java.util.Map;


public class Student {
    String name;
    Map<String, Subject> diary = new LinkedHashMap<>();

    public Student(){
        diary.put("Math", new Subject("Math"));
        diary.put("PE", new Subject("PE"));
        diary.put("Literature", new Subject("Literature"));
        diary.put("Physics", new Subject("Physics"));
    }

    public void addScore(String subName, int score) {
        diary.get(subName).subGrade.add(score);
    }

    public int showScore(String subName, int score) {
        int newScores = diary.get(subName).subGrade.get(0);
        return newScores;
    }






}
