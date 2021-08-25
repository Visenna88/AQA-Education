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

    public void addScore(String subjectName, int score) {
        diary.get(subjectName).subGrade.add(score);
    }
}
